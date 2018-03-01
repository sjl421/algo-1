"""
Given a non-negative integer represented as a non-empty array of digits,
plus one to the integer. You may assume the integer do not contain any leading zero,
except the number 0 itself. The digits are stored such that the most significant
digit is at the head of the list.
"""


def plus_one(digits):
    n, i = len(digits), 0
    adding = True
    while adding and i < n:
        index = n - i - 1
        digit = digits[index]
        digit += 1
        if digit < 10:
            digits[index] = digit
            adding = False
        else:
            digits[index] = 0
            adding = True
        i += 1

    return [1] + digits if adding else digits


assert [1] == plus_one([0])
assert [9, 0, 0] == plus_one([8, 9, 9])
assert [1, 0, 0, 0] == plus_one([9, 9, 9])
