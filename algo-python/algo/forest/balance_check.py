# coding=utf-8
from algo.forest.bst_check import create_valid_bst
from algo.forest.tree_height import TreeNode, tree_height

"""
Check if a binary tree is balanced.
A height-balanced binary tree is defined as a binary tree in which 
the depth of the two subtrees of every node never differ by more than 1.
"""


def is_balanced(tree):
    """
    Brute-force implementation based on calculating the difference between heights of each sub tree.
    The heights are calculated by traversing each sub tree in a post-order manner.
    As height calculation is made for each node, the time complexity is quadratic, O(n^2)
    """
    if not tree:
        return True

    height_diff = tree_height(tree.left) - tree_height(tree.right)
    return abs(height_diff) <= 1 and is_balanced(tree.left) and is_balanced(tree.right)


def is_balanced_fast(tree):
    """
    Faster solution that runs in O(n).
    The idea is to calculate height in the same recursion rather than calling height() separately.
    """
    def is_balanced_post_order(node):
        if not node:
            return True, 0

        left_balanced, left_height = is_balanced_post_order(node.left)
        right_balanced, right_height = is_balanced_post_order(node.right)

        height = max(left_height, right_height) + 1
        return abs(left_height - right_height) <= 1 and left_balanced and right_balanced, height

    balanced, _ = is_balanced_post_order(tree)
    return balanced


def test(solution):
    print('testing:', solution.__name__)
    l1 = TreeNode(15, TreeNode(18, TreeNode(20)))
    assert not solution(l1)

    l2 = TreeNode(7)
    assert solution(l2)

    l3 = TreeNode(11, l1, l2)
    assert not solution(l3)

    r1 = TreeNode(6)
    assert solution(r1)

    r2 = TreeNode(8, None, r1)
    assert solution(r2)

    tree = TreeNode(9, l3, r2)
    assert not solution(tree)

    assert solution(create_valid_bst())
    print('passed')


if __name__ == '__main__':
    test(is_balanced)
    test(is_balanced_fast)
