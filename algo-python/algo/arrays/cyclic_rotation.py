# coding=utf-8
"""
A zero-indexed array A consisting of N integers is given.
Rotation of the array means that each element is shifted right by one index,
and the last element of the array is moved to the first place.

For example, the rotation of array
    A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
    (elements are shifted right by one index and 6 is moved to the first place).

Write a function that, given a zero-indexed array A consisting of N integers
and an integer K, returns the array A rotated K times.
"""


def rotate(array, offset=1):
    n = len(array)
    if n == 0:
        return array
    offset %= n
    return array if offset == 0 else array[-offset:n] + array[0:n-offset]


# 1 2 3 4
# 4 1 2 3
# 3 4 1 2
# 2 3 4 1
# 1 2 3 4

a = [1, 2, 3, 4]
b = rotate(a, 7)
print(b)

a = []
b = rotate(a, 1)
print(b)

