# coding=utf-8
from algo.structures.binary_tree import BinaryTree
from algo.forest.binary_tree_traversals import in_order

"""
Binary search tree is a rooted binary tree that satisfies binary search property
which states that the key in each node must be greater than or equal to any key 
stored in the left sub-tree, and less than or equal to any key 
stored in the right sub-tree.

https://en.wikipedia.org/wiki/Binary_search_tree
"""


def check_bst(tree: BinaryTree):
    """
    Very simple and clear solution based on the fact that in-order traversal of a BST
        yields values in a sorted order.
    """
    values = []
    in_order(tree, callback=lambda key: values.append(key))     # fills the list with tree keys
    return values == sorted(values)     # check if keys are in a sorted order


def check_bst2(tree: BinaryTree):
    """
    Classic solution based on checking of the BST property recursively (pre-order traversal)
    """
    def check_bst_rec(node, min_val, max_val):
        if not node:
            return True

        # BST property
        def is_valid_bst(key, left, right): return left <= key <= right

        return is_valid_bst(node.key, min_val, max_val) \
            and check_bst_rec(node.left, min_val, node.key) \
            and check_bst_rec(node.right, node.key, max_val)

    return check_bst_rec(tree, float('-inf'), float('inf'))


def create_valid_bst():
    root = BinaryTree(8)
    root.insert_left(3)
    root.left.insert_left(1)
    root.left.insert_right(6)
    root.left.right.insert_left(4)
    root.left.right.insert_right(7)

    root.insert_right(10)
    root.right.insert_left(9)
    root.right.insert_right(14)
    root.right.right.insert_left(13)
    return root


def test(solution):
    print('testing:', solution.__name__)
    valid_tree = create_valid_bst()
    assert solution(valid_tree)
    print('passed')


if __name__ == '__main__':
    test(check_bst)
    test(check_bst2)
