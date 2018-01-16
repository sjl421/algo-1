# coding=utf-8


def find_missing_element(nums):
    n = len(nums)
    if n == 0:
        return 1
    expected_sum = (2 + n) * (n + 1) // 2
    actual_sum = 0
    for num in nums:
        actual_sum += num
    return expected_sum - actual_sum


# tests

assert 1 == find_missing_element([])
assert 2 == find_missing_element([1])
assert 1 == find_missing_element([2])
assert 4 == find_missing_element([2, 3, 1, 5])
