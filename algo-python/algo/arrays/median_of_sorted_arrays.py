"""
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
"""


def find_median(nums1, nums2):
    merged = merge(nums1, nums2)
    n = len(merged)
    if n == 0:
        return None
    if n % 2 != 0:
        return merged[n // 2]
    else:
        median = (n - 1) // 2
        return (merged[median] + merged[median+1]) / float(2)


def merge(nums1, nums2):
    """
    merge two sorted arrays in O(n+m)
    """
    n = len(nums1) + len(nums2)
    merged = [0]*n
    first, second = 0, 0

    for k in range(n):
        if first >= len(nums1):
            merged[k] = nums2[second]
            second += 1
        elif second >= len(nums2):
            merged[k] = nums1[first]
            first += 1
        elif nums1[first] < nums2[second]:
            merged[k] = nums1[first]
            first += 1
        else:
            merged[k] = nums2[second]
            second += 1

    return merged


assert find_median([], []) is None
assert 1.5 == find_median([1, 2], [])
assert 2 == find_median([1, 3], [2])
assert 2.5 == find_median([1, 2], [3, 4])
