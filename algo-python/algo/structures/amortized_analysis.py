# coding=utf-8

import math

from algo.structures.dynamic_array import DynamicArray


def test_doubling(n):
    a = DynamicArray(10, 2)
    for num in range(n):
        a.append(num)

    print('number of doubles for n={} is {} with capacity={} potential={}'
          .format(n, a.number_of_doubles, a.capacity, a.potential))


test_doubling(10)               # 0
test_doubling(100)              # 4
test_doubling(1000)             # 6
test_doubling(10000)            # 10
test_doubling(100000)           # 14
test_doubling(1000000)          # 17
test_doubling(1000000 * 10)     #

"""
let's find number of doubles

c0 = 10 is initial capacity

before 1st grow: c0                                   = c0*2^0 
before 2nd grow: c0 + c0                              = c0*2^1
before 3rd grow: c0 + c0 + 2*c0                       = c0*2^2
before 4th grow: c0 + c0 + 2*c0 + 2*2*c0              = c0*2^3
before 5th grow: c0 + c0 + 2*c0 + 2*2*c0 + 2*2*2*c0   = c0*2^4
and so on...

it is clear that: 

    c0*2^3 <= 100 <= c0*2^4

hence, if k is the number of doubles, than:

    k <= log2(100 / c0)
"""


def growth_count(f, n, c0):
    """
    :param f: growth factor
    :param n: number of elements to add
    :param c0: initial capacity
    :return: number of growths of a dynamic array by factor of f
    """
    return int(math.log(n / float(c0), f)) + 1


fn = growth_count

print('\r\ncalculation by formula of growths count for c0=10, factor=2: ')
print('doubles for 100:', fn(2, 100, 10))
print('doubles for 1K:', fn(2, 1000, 10))
print('doubles for 10K:', fn(2, 10000, 10))
print('doubles for 100K:', fn(2, 100000, 10))
print('doubles for 1MLN:', fn(2, 1000000, 10))

print('\r\ngrowths count for c0=1, factor=2: ')
print('doubles for 1MLN:', fn(2, 1000000, 1))

print('\r\ngrowths count for c0=10, factor=1.5: ')
print('doubles for 1MLN:', fn(1.5, 1000000, 10))

"""
The amortized cost per operation for a sequence of n operations is the total
cost of the operations divided by n.

For example, if we have 100 operations at cost 1, followed by one operation at cost 100,
the amortized cost per operation (100 + 100) / (100 + 1) = 200/101 < 2
"""
