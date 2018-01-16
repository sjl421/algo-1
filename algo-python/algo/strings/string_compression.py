# coding=utf-8

"""
Given a string in the form 'AAAABBBBCCCCCDDEEEE' compress it to become 'A4B4C5D2E4'.
For this problem, you can falsely "compress" strings of single or double letters.
For instance, it is okay for 'AAB' to return 'A2B1' even though this technically takes more space.

The function should also be case sensitive, so that a string 'AAAaaa' returns 'A3a3'.
"""


def compress(s):
    if len(s) == 0:
        return s
    if len(s) < 2:
        return s + '1'

    result = ''
    length, i, count = len(s), 1, 1

    while i < length:
        if s[i] == s[i-1]:
            count += 1
        else:
            result += s[i-1] + str(count)
            count = 1
        i += 1
    return result + s[i-1] + str(count)


def test(sol):
    print('testing:', sol.__name__)
    assert '' == sol('')
    assert 'a1' == sol('a')
    assert 'A2B2C2a1' == sol('AABBCCa')
    assert 'A3B1C2D5' == sol('AAABCCDDDDD')
    print('ok')


test(compress)
