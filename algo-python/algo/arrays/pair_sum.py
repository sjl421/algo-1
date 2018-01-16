# coding=utf-8
"""
Given an integer array, output all the unique pairs that sum up to a specific value k.

Input:
    [1,3,2,2], 4

Output:
    (1,3)
    (2,2)
"""


def pair_sum(nums, target):
    if len(nums) < 2:
        raise ValueError("nums array should have at least two values")

    nums_map = {}
    n = len(nums)
    for index in range(n):
        nums_map[nums[index]] = index

    result = set()
    for index1 in range(n):
        complement = target - nums[index1]
        index2 = nums_map[complement] if complement in nums_map else None
        if index2 is not None and index2 != index1:
            result.add((min(index1, index2), max(index1, index2)))

    return result


print(pair_sum([1, 3, 2, 2], 4))
