def is_balanced(string):
    if len(string) < 2:
        return False
    stack = []
    opening = set('([{')
    matches = {('(', ')'), ('{', '}'), ('[', ']')}
    for paren in string:
        if paren in opening:
            stack.append(paren)
        else:
            if len(stack) == 0:
                return False
            previous = stack.pop()
            if (previous, paren) not in matches:
                return False
    return len(stack) == 0


assert not is_balanced('{')
assert not is_balanced(']')
assert not is_balanced('{([])')
assert not is_balanced('((([[}])))')
assert is_balanced('((([[]])))')
assert not is_balanced('[](){([[[]]])}(')
assert is_balanced('[{{{(())}}}]((()))')
assert not is_balanced('[[[]])]')
