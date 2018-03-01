
class Deque:

    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def add_first(self, item):
        self.items.insert(0, item)

    def add_last(self, item):
        self.items.append(item)

    def remove_first(self):
        return self.items.pop(0)

    def remove_last(self):
        return self.items.pop(self.size() - 1)


d = Deque()

d.add_first(1)
d.add_first(2)
d.add_first(3)

assert 3 == d.remove_first()
assert 1 == d.remove_last()
assert 2 == d.remove_first()
assert d.is_empty()
