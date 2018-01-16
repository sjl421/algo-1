# coding=utf-8


class Stack:

    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def push(self, item):
        self.items.append(item)

    def pop(self):
        top = self.size() - 1
        item = self.items[top]
        del self.items[top]
        return item

    def peek(self):
        top = self.size()-1
        return self.items[top]


s = Stack()
assert s.is_empty()

s.push(1)
s.push("hello")
s.push("stack")

assert 3 == s.size()
assert "stack" == s.pop()
assert 2 == s.size()
assert "hello" == s.peek()
assert 2 == s.size()
assert "hello" == s.pop()
assert 1 == s.pop()
assert s.is_empty()
