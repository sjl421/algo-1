class Queue2Stacks:
    """Queue implementation using on two stacks """

    def __init__(self):
        self.in_stack = []
        self.out_stack = []

    def is_empty(self):
        """ Checks whether the queue is empty """
        return not self.in_stack and not self.out_stack

    def enqueue(self, item):
        """ Adds an item to the rear of the queue """
        self.in_stack.append(item)

    def dequeue(self):
        """ Removes a front item from the queue """
        if not self.out_stack:
            while self.in_stack:
                self.out_stack.append(self.in_stack.pop())
        return self.out_stack.pop()


q = Queue2Stacks()

for num in range(5):
    q.enqueue(num)

assert 0 == q.dequeue()
assert 1 == q.dequeue()
assert 2 == q.dequeue()

q.enqueue(5)
q.enqueue(6)

assert 3 == q.dequeue()
assert 4 == q.dequeue()
assert 5 == q.dequeue()
assert 6 == q.dequeue()

help(Queue2Stacks)

"""
Note that class definition adds 2 data descriptors:

__dict__ - dictionary for instance variables (if defined)
__weakref__ - list of weak references to the object (if defined)
"""
