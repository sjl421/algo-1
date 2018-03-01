
class Queue:

    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def enqueue(self, item):
        self.items.insert(0, item)

    def dequeue(self):
        if not self.is_empty():
            front = len(self.items) - 1
            item = self.items[front]
            del self.items[front]
            return item
        raise ValueError("queue is empty")


if __name__ == '__main__':
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    assert 1 == q.dequeue()
    assert 2 == q.dequeue()
    assert q.is_empty()
