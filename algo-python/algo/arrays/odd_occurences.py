# coding=utf-8

"""
A non-empty zero-indexed array A consisting of N integers is given.
The array contains an odd number of elements, and each element of the array
can be paired with another element that has the same value,
except for one element that is left unpaired. Find the unpaired element.
"""


def find_unpaired(int_array):
    xor = 0
    for num in int_array:
        xor ^= num
    return xor


def print_bin(array):
    for a in array:
        print(bin(a)[2:])


assert 0 == find_unpaired([0])

assert 1 == find_unpaired([0, 0, 1])

assert 7 == find_unpaired([9, 3, 9, 3, 9, 7, 9])

assert 5 == find_unpaired([5, 3, 2, 3, 2])
print_bin([5, 3, 2, 3, 2])

assert 0 == find_unpaired([9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1])

assert 0 == find_unpaired([9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
