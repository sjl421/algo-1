# coding=utf-8


def arithmetic_sum(nums):
    """
    Sum of arithmetic progression for zero-indexed array
    """
    n = len(nums)
    return (nums[0] + nums[n-1]) * n // float(2)


def geometric_sum(n, b1, q):
    """
    Sum of geometric progression for zero-indexed array
    """
    return n * b1 if float(q) == 1.0 else b1*(q**n - 1) / float(q - 1)

# tests


assert float(15) == arithmetic_sum([1, 2, 3, 4, 5])
assert float(531440) == geometric_sum(12, 2, 3)
