"""
Fibonacci sequence is defined as: f(n) = f(n-1) + f(n-2)
"""


def fibo(n):
    if n < 2:
        return n
    prev2, prev1, index, val = 0, 1, 2, 0
    while index <= n:
        val = prev2 + prev1
        prev2 = prev1
        prev1 = val
        index += 1
    return val


def test_fibo():
    assert 0 == fibo(0)
    assert 1 == fibo(1)
    assert 1 == fibo(2)
    assert 2 == fibo(3)
    assert 3 == fibo(4)
    assert 5 == fibo(5)
    assert 8 == fibo(6)
    assert 13 == fibo(7)
    assert 377 == fibo(14)


def fibonacci_generator(n):
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


def test_generator():
    for num in fibonacci_generator(14):
        print(num, end=' ')
        print()


if __name__ == '__main__':
    test_fibo()
    test_generator()
