"""
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root
node down to the nearest leaf node.
"""
from algo.structures.binary_tree import BinaryTree


def min_depth(root: BinaryTree):
    if not root:
        return 0

    left, right = min_depth(root.left), min_depth(root.right)
    if root.left and root.right:
        return min(left, right) + 1
    else:
        return max(left, right) + 1


def test():
    root = BinaryTree(8)

    assert 1 == min_depth(root)

    root.insert_left(3)
    root.left.insert_left(1)
    root.left.insert_right(6)

    assert 3 == min_depth(root)

    root.insert_right(10)

    assert 2 == min_depth(root)

    root.left.right.insert_left(4)
    root.left.right.insert_right(7)

    assert 2 == min_depth(root)

    root.right.insert_left(9)

    assert 3 == min_depth(root)

    print('final depth=', min_depth(root))


if __name__ == '__main__':
    test()
