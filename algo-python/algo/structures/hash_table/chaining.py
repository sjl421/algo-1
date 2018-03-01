
class Node:
    def __init__(self, key, value, next_node=None):
        self.key = key
        self.value = value
        self.next = next_node


class HashTable:

    def __init__(self):
        self.load_factor = 0.75

    def get(self, key):
        pass

    def put(self, key, value):
        key_hash = hash(key)
