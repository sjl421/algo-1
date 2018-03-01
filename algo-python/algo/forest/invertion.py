from algo.forest.binary_tree_traversals import level_order
from algo.forest.bst_check import create_valid_bst

"""
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
"""


def invert_tree(root):
    if not root:
        return

    tmp = root.right
    root.right = root.left
    root.left = tmp

    invert_tree(root.left)
    invert_tree(root.right)

    return root


if __name__ == '__main__':
    print('before:')
    tree = create_valid_bst()
    level_order(tree)

    print('\nafter:')
    tree = invert_tree(tree)
    level_order(tree)
