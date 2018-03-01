"""
Given 2 lists:
    white_list = [4, 2, 6]
    check = [5, 1, 2, 3]

Find if any item from checklist occurs in `white_list`.
Follow up:
    - lazy check
    - list sizes are big - 1 mln items each
    - there are 1 mln different `check` lists of small size
    - how to benchmark solutions ?
"""


def main():
    white_list = [4, 2, 6]
    check = [5, 1, 2, 3]
    print(any(x in white_list for x in check))


if __name__ == '__main__':
    main()
