"""
Trivial implementation of a hash table using list as a base,
    most simple hash function ever - mod,
    and resolving collisions via linear probing.
"""


class HashTable:

    def __init__(self, initial_size=10):
        self.size = initial_size
        self.buckets = [None] * self.size
        self.data = [None] * self.size

    def put(self, key, data):
        index = self.hash_function(key)

        if self.buckets[index] is None:
            self.buckets[index] = key
            self.data[index] = data

        elif self.buckets[index] == key:
            self.data[index] = data

        else:
            next_index = self.rehash(index)
            while self.buckets[next_index] is not None and self.buckets[next_index] != key:
                next_index = self.rehash(next_index)

            if self.buckets[next_index] is None:
                self.buckets[next_index] = key
                self.data[next_index] = data
            else:
                self.data[next_index] = data

    def get(self, key):
        start_index = self.hash_function(key)
        index = start_index
        found, stop = False, False
        while self.buckets[index] is not None and not found and not stop:
            if self.buckets[index] == key:
                found = True
            else:
                index = self.rehash(index)
                if index == start_index:
                    stop = True
        return self.data[index] if found else None

    def hash_function(self, key):
        """
        Most simple hash function that converts an item directly to a table index using mod
        """
        return key % self.size

    def rehash(self, old_hash_value):
        """ linear probing """
        return (old_hash_value + 1) % self.size


def test():
    t = HashTable(10)
    t.put(11, 'one')
    t.put(5, 'two')
    t.put(12, 'three')

    t.put(15, 'four')  # must clash with (5, 'two')

    print('buckets:', t.buckets)
    print('data:', t.data)

    print('table get results:', t.get(11), t.get(5), t.get(12), t.get(15))


if __name__ == '__main__':
    test()
