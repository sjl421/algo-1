# coding=utf-8


class TreeNode:
    def __init__(self, x, left=None, right=None):
        self.val = x
        self.left = left
        self.right = right


def tree_height(root):

    def find_height_post_order(node):
        if not node:
            return -1

        heights = (find_height_post_order(node.left), find_height_post_order(node.right))
        return max(heights) + 1

    return find_height_post_order(root)


if __name__ == '__main__':
    l1 = TreeNode(15, TreeNode(18))
    l2 = TreeNode(7)
    l3 = TreeNode(11, l1, l2)
    r1 = TreeNode(6)
    r2 = TreeNode(8, None, r1)
    trunk = TreeNode(9, l3, r2)

    assert 3 == tree_height(trunk)
