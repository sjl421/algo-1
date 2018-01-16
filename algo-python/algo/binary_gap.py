# coding=utf-8


"""
A binary gap within a positive integer N is any maximal sequence of consecutive
zeros that is surrounded by ones at both ends in the binary representation of N.

  9 is 1001 => 2
529 is 1000010001 => 4
"""


def max_binary_gap(n):
    binary_repr = bin(n)[2:]
    gap_value, max_gap = 0, 0
    is_gap_open = False
    for bit in binary_repr:
        if bit == '0' and is_gap_open:
            gap_value += 1
        else:
            if gap_value > max_gap and is_gap_open:
                max_gap = gap_value
            gap_value = 0
            is_gap_open = True
    return max_gap


assert 0 == max_binary_gap(1)
assert 2 == max_binary_gap(9)
assert 0 == max_binary_gap(15)
assert 4 == max_binary_gap(bin)
assert 1 == max_binary_gap(20)
assert 5 == max_binary_gap(1041)
assert 3 == max_binary_gap(561892)
