# coding=utf-8


"""
Fibonacci sequence is defined as: f(n) = f(n-1) + f(n-2)
"""


def fibonacci_sequence(n):
    yield 0
    if n >= 1:
        yield 1
    prev2, prev1, index = 0, 1, 2
    while index <= n:
        next_number = prev2 + prev1
        prev2 = prev1
        prev1 = next_number
        index += 1
        yield next_number


def test():
    for num in fibonacci_sequence(14):
        print(num, end=' ')


if __name__ == '__main__':
    test()
