"""
In an array of integers where the numbers go increasingly,
and at some point will start decreasing like this: -1 2 3 4 5 6 7 8 4 3 0
Find peak element.
"""


def find_peak(nums):
    if len(nums) == 0:
        return -1

    def binary_search(arr, lo, hi):
        if hi < lo:
            return -1
        mid = (lo + hi) // 2
        if arr[mid-1] < arr[mid] > arr[mid+1]:
            return mid
        elif arr[mid-1] < arr[mid] < arr[mid+1]:
            return binary_search(arr, mid+1, hi)
        else:
            return binary_search(arr, 0, mid-1)

    return binary_search(nums, 0, len(nums) - 1)
