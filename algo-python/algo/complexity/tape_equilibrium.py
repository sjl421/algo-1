# coding=utf-8


def find_equilibrium(nums):
    head, tail = nums[0], sum(nums[1:])
    min_diff = abs(head - tail)
    n = len(nums)
    if n == 2:
        return min_diff

    for index in range(1, n-1):
        head += nums[index]
        tail -= nums[index]
        diff = abs(head - tail)
        if diff < min_diff:
            min_diff = diff

    return min_diff


# tests

assert 2 == find_equilibrium([4, 2])
assert 2000 == find_equilibrium([-1000, 1000])
assert 1 == find_equilibrium([-10, 10, 1, 2])
assert 0 == find_equilibrium([1, 1])
assert 1 == find_equilibrium([3, 1, 2, 4, 3])
assert 0 == find_equilibrium([1, 2, 3])
assert 20 == find_equilibrium([-10, -20, -30, -40, 100])
