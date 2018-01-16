# coding=utf-8
"""
Implementation of a binary search
"""


def binary_search(input_array, value):
    lo = 0
    hi = len(input_array) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if input_array[mid] < value:
            lo = mid + 1
        elif input_array[mid] > value:
            hi = mid - 1
        else:
            return mid
    return -1


test_list = [1, 3, 9, 11, 15, 19, 29]

print(binary_search(test_list, 25))
print(binary_search(test_list, 15))
print(binary_search(test_list, 29))
