"""
Brute force algorithm for generating permutations
"""


alphabet = ('a', 'b', 'c')
n = len(alphabet)
perms = {}
for i1 in range(n):
    c1 = alphabet[i1]
    perms[c1] = []
    for i2 in range(n):
        c2 = alphabet[i2]
        for i3 in range(n):
            c3 = alphabet[i3]
            perms[c1].append(c1 + c2 + c3)


print(perms['a'])
print(perms['b'])
print(perms['c'])

"""
Permutations for 'a':

aaa aab aac
aba abb abc
aca acb acc
"""
