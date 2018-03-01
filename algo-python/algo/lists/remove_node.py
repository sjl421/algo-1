from algo.lists.list_reverse import ListNode

"""
Removing a node having only access to that node
"""


def remove(node):
    node.val = node.next.val
    node.next = node.next.next


tail = ListNode(3, ListNode(4, ListNode(5)))
head = ListNode(1, ListNode(2, tail))
remove(tail)

curr = head
while curr is not None:
    print(curr.val)
    curr = curr.next
