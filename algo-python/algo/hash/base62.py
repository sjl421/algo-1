# coding=utf-8


SYMBOLS = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'


def decimal_to_base62(num):
    base62 = ''
    while num > 0:
        base62 = SYMBOLS[num % 62] + base62
        num //= 62
    return base62


def base62_to_decimal(base62str):
    def ord_base62(c):
        if '0' <= c <= '9':
            return int(c)
        elif 'a' <= c <= 'z':
            return ord(c) - ord('a') + 10
        elif 'A' <= c <= 'Z':
            return ord(c) - ord('A') + 36
        else:
            return -1
    base10 = 0
    for symbol in base62str:
        base10 = base10 * 62 + ord_base62(symbol)
    return base10


def test():
    assert 'q8Y' == decimal_to_base62(100500)
    assert '2aL26wg' == decimal_to_base62(123456789000)

    assert 100500 == base62_to_decimal('q8Y')
    assert 123456789000 == base62_to_decimal('2aL26wg')


if __name__ == '__main__':
    test()
