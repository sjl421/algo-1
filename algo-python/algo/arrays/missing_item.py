# coding=utf-8
"""
There is an array of non-negative integers.
A second array is formed by shuffling the elements of the first array and deleting a random element.
Given these two arrays, find which element is missing in the second array.
"""


def find_missing_item(a, b):
    """
    Time complexity: O(n), space complexity: O(n)
    """
    if a is None or len(a) == 0:
        return None

    def frequency_map(arr):
        m = {}
        for item in arr:
            m[item] = 1 if m.get(item) is None else m[item] + 1
        return m

    map_a = frequency_map(a)
    map_b = frequency_map(b)

    for k in map_a:
        if map_b.get(k) is None or map_b[k] < map_a[k]:
            return k

    return None


x = find_missing_item([1, 2, 3, 4, 5, 6, 7], [3, 7, 2, 1, 4, 6])
print(x)


def find_missing_item2(arr1, arr2):
    """
    Time complexity: O(n), space complexity: O(1)
    """
    missing = 0
    for num in arr1 + arr2:
        missing ^= num
    return missing


x = find_missing_item2([1, 2, 3, 4, 5, 6, 7], [3, 7, 2, 1, 4, 6])
print(x)


