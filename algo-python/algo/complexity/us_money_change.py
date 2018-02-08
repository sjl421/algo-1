"""
Change Problem:
    Convert some amount of money into given denominations,
    using the smallest possible number of coins.

Input:
    An integer money and an array of d denominations c = (c1, c2, ..., cd),
    in decreasing order of value (c1 > c2 > ... > cd).

Output:
    A list of d integers i1, i2, ..., id such that c1*i1 + c2*i2 + ... + cd*id = money
    and i1 + i2 + ... + id is as small as possible.

Let's assume that denominations are limited to US coins: 25, 10, 5, 1.

Algorithm: exhaustive search (brute force)
Running time is exponential: O(n) = d * ( money ^ d / c1 * ... * cd )
"""


US_COINS = (25, 10, 5, 1)


def get_change_brute_force(money):
    min_num_of_coins = float('inf')
    num_of_operations = 0
    c1, c2, c3, c4 = US_COINS
    change = (0, 0, 0, 0)
    for i1 in range(money // c1 + 1):
        for i2 in range(money // c2 + 1):
            for i3 in range(money // c3 + 1):
                for i4 in range(money // c4 + 1):
                    coins_value = i1*c1 + i2*c2 + i3*c3 + i4*c4
                    if coins_value == money:
                        num_of_coins = i1 + i2 + i3 + i4
                        if num_of_coins < min_num_of_coins:
                            min_num_of_coins = num_of_coins
                            change = (i1, i2, i3, i4)
                        num_of_operations += 4
                    num_of_operations += 4
    return change, num_of_operations


money = 77
ch, operations = get_change_brute_force(money)
print("change for {} is {}, number of operations: {}".format(money, ch, operations))
