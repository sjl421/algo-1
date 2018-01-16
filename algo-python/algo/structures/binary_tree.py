# coding=utf-8


class BinaryTree:
    """
    Classic binary tree implementation featuring Python's properties
    """
    def __init__(self, root_key, left=None, right=None):
        self.__key = root_key
        self.__left = left
        self.__right = right

    def insert_left(self, new_key):
        left_child = None if self.left is None else self.left
        self.__left = BinaryTree(new_key, left_child)

    def insert_right(self, new_key):
        right_child = None if self.right is None else self.right
        self.__right = BinaryTree(new_key, None, right_child)

    @property
    def key(self):
        return self.__key

    @key.setter
    def key(self, new_key):
        self.__key = new_key

    @property
    def right(self):
        return self.__right

    @right.setter
    def right(self, new_node):
        self.__right = new_node

    @property
    def left(self):
        return self.__left

    @left.setter
    def left(self, new_node):
        self.__left = new_node


def get_test_tree() -> BinaryTree:
    root = BinaryTree('a')
    root.insert_left('b')
    root.left.insert_left('d')
    root.left.insert_right('e')

    root.insert_right('c')
    root.right.insert_left('f')
    root.right.insert_right('g')
    return root


if __name__ == '__main__':
    t = get_test_tree()
    print('     ', t.key)
    print('  ', t.left.key, '   ', t.right.key)
    print(' ', t.left.left.key, t.left.right.key,
          ' ', t.right.left.key, t.right.right.key)
