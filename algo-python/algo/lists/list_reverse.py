"""
Reverse a singly linked list
"""


class ListNode:
    def __init__(self, x, next_item=None):
        self.val = x
        self.next = next_item


def reverse_list(head):
    curr, tail, prev = head, head, None
    while curr is not None:
        tail = curr.next
        curr.next = prev
        prev = curr
        curr = tail
    return prev


a = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
b = reverse_list(a)

assert 4 == b.val
assert 3 == b.next.val
assert 2 == b.next.next.val
assert 1 == b.next.next.next.val
assert b.next.next.next.next is None
