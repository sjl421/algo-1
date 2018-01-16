# coding=utf-8
import itertools


def permutation(elements):
    if len(elements) < 2:
        yield elements
    else:
        for perm in permutation(elements[1:]):
            for i in range(len(elements)):
                yield perm[:i] + elements[0:1] + perm[i:]


for p in permutation([1, 2, 3]):
    print(p)


# using itertools

for p in itertools.permutations('abc'):
    print(p)
