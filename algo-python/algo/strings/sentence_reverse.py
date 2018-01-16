# coding=utf-8
"""
Given a string of words, reverse all the words
"""


def check_args(s):
    if s is None:
        raise ValueError('input string is null')


def reverse(s):
    check_args(s)
    spaces, words = [' '], []
    length = len(s)
    i = 0
    while i < length:
        if s[i] not in spaces:
            word_start = i
            while i < length and s[i] not in spaces:
                i += 1
            words.append(s[word_start:i])
        i += 1
    return ' '.join(reversed(words))


def reverse_one_liner(s):
    return ' '.join(reversed(s.split()))


def reverse_one_liner2(s):
    return ' '.join(s.split()[::-1])


def test(fun):
    print('testing:', fun.__name__)
    assert '' == fun('')
    assert 'a' == fun('a')
    assert 'b a' == fun('a b')
    assert 'c b, a' == fun('a b, c')
    assert 'best the is This' == fun('This is the best')
    assert 'here space,' == fun('  space, here   ')


test(reverse)
test(reverse_one_liner)
test(reverse_one_liner2)
