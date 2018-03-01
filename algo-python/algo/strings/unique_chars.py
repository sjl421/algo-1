"""
Write an algorithm to determine if a string has all unique characters.
What if additional data structures are not allowed ?
"""


def is_unique(string):
    if string is None:
        raise ValueError("Input string is null")
    if len(string) < 2:
        return True

    seen = set()
    for char in string:
        if char in seen:
            return False
        else:
            seen.add(char)
    return True


def is_unique_one_liner(string):
    return len(set(string)) == len(string)


def test(sol):
    print('testing:', sol.__name__)
    assert sol('')
    assert sol('a')
    assert sol('abcdefg')
    assert not sol('abcdefgc')
    print('ok')


test(is_unique)
test(is_unique_one_liner)
