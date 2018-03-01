"""
Given an array of integers (positive and negative) find the largest continuous sum.
"""


def brute_force(arr):
    """
    Time complexity: O(n^2)
    """
    max_sum = 0
    max_indexes = (0, 0)
    for i in range(len(arr)):
        current_sum = 0
        for j in range(i, len(arr)):
            current_sum += arr[j]
            if current_sum > max_sum:
                max_sum = current_sum
                max_indexes = i, j
    return max_sum, max_indexes


def dynamic_programming(arr):
    """
    Time complexity: O(n)
    """
    current_sum = max_sum = arr[0]
    for num in arr[1:]:
        current_sum = max(current_sum + num, num)
        max_sum = max(current_sum, max_sum)
    return max_sum, ()


def test(fun):
    print('\nTesting:', fun.__name__)

    test1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    assert 6 == fun(test1)[0]

    test2 = [1, 2, -1, 3, 4, 10, 10, -10, -1]
    assert 29 == fun(test2)[0]

    test3 = [-1, 2, -1, 3, 4, 10, -10, 1, 2]
    assert 18 == fun(test3)[0]

    print('ok')


if __name__ == '__main__':
    test(brute_force)
    test(dynamic_programming)
