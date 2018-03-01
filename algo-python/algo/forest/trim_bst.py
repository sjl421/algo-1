from algo.forest.binary_tree_traversals import level_order
from algo.forest.bst_check import create_valid_bst
from algo.structures.binary_tree import BinaryTree

"""
Given the root of a BST and 2 numbers min and max, trim the tree such that
all the numbers in the new tree are between min and max (inclusive).
The resulting tree should still be a valid BST.
"""


def trim_bst(root: BinaryTree, min_val, max_val):

    def post_order_and_trim(node):
        if not node:
            return

        node.left = post_order_and_trim(node.left)
        node.right = post_order_and_trim(node.right)

        if min_val <= node.key <= max_val:
            return node

        return node.right if node.key < min_val else node.left

    post_order_and_trim(root)
    return root


tree = create_valid_bst()

print('before trim:')
level_order(tree)

tree = trim_bst(tree, 5, 13)

print('after trim:')
level_order(tree)
