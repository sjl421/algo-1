# coding=utf-8

"""
Probably the simplest way to implement a tree is to use lists of lists.

Example:

    ['a',   # root
        ['b',   # left sub node
            ['d', [], []],
            ['e', [], []]
        ],
        ['c'    # right sub node
            ['f', [], []],
            ['g', [], []]
        ]
    ]

"""


def binary_tree(root):
    """ Implementation of a binary tree using list of a lists """
    return [root, [], []]


def insert_left(root, new_value):
    left = root.pop(1)
    branch = [new_value, left, []] if len(left) > 1 else [new_value, [], []]
    root.insert(1, branch)
    return branch


def insert_right(root, new_value):
    right = root.pop(2)
    branch = [new_value, [], right] if len(right) > 1 else [new_value, [], []]
    root.insert(2, branch)
    return branch


def get_root_val(root):
    return root[0]


def set_root_val(root, new_value):
    root[0] = new_value


def get_left_child(root):
    return root[1]


def get_right_child(root):
    return root[2]


def print_tree(root):
    print("['" + root[0] + "',")

    def print_branch(branch, index):
        height = 1
        while len(branch) > 1:
            shift = '  ' * height
            if len(branch[index]) > 0:
                print(shift, "['" + branch[0] + "', ")
            else:
                print(shift, branch)
            branch = branch[index]
            height += 1
        print('  ', "]")

    print_branch(root[1], 1)
    print_branch(root[2], 2)
    print(']')


t = binary_tree('a')

insert_left(insert_left(t, 'b'), 'd')
insert_right(insert_right(t, 'c'), 'g')

print_tree(t)
