# coding=utf-8
from algo.structures.queue import Queue
from algo.structures.binary_tree import get_test_tree

"""
Implementation of classic binary tree traversals
"""


def pre_order(tree, callback=print):
    """
    Pre-order traversal
    """
    if tree:
        callback(tree.key)
        pre_order(tree.left, callback)
        pre_order(tree.right, callback)


def post_order(tree, callback=print):
    """
    Post-order traversal
    """
    if tree:
        post_order(tree.left, callback)
        post_order(tree.right, callback)
        callback(tree.key)


def in_order(tree, callback=print):
    """
    In-order traversal - yields tree keys in sorted order for BST
    """
    if tree:
        in_order(tree.left, callback)
        callback(tree.key)
        in_order(tree.right, callback)


def level_order(tree,
                key_callback=lambda key: print(key, end=' '),
                level_callback=print):
    """
    Level-order traversal
    :param tree: BinaryTree object
    :param key_callback: function that processes a key
    :param level_callback: function that executes when all keys in a current level are processed
    """
    queue = Queue()
    queue.enqueue(tree)
    current_count, next_count = 1, 0

    def enqueue_node(child_node, count):
        if not child_node:
            return count
        queue.enqueue(child_node)
        return count + 1

    while not queue.is_empty():
        node = queue.dequeue()
        key_callback(node.key)

        current_count -= 1
        next_count = enqueue_node(node.left, next_count)
        next_count = enqueue_node(node.right, next_count)

        if current_count == 0:
            level_callback()
            current_count, next_count = next_count, 0


if __name__ == '__main__':
    t = get_test_tree()

    print('pre order traversal: ')
    pre_order(t)

    print('post order traversal: ')
    post_order(t)

    print('in order traversal: ')
    in_order(t)

    print('level order traversal: ')
    level_order(t)
