
def count_bits(num):
    """
    https://leetcode.com/problems/counting-bits/description/
    """
    bits = [0] * (num + 1)
    if num == 0:
        return bits

    i = 1
    while i <= num:
        i += 1

    return bits


assert [0] == count_bits(0)
assert [0, 1] == count_bits(1)
assert [0, 1, 1] == count_bits(2)
assert [0, 1, 1, 2, 1, 2] == count_bits(5)
