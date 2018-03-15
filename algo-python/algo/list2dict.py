

def list2dict(names):
    return list(map(lambda x: {'name': x}, names))


a = ['bill', 'fred', 'sam']
b = [{'name': 'bill'}, {'name': 'fred'}, {'name': 'sam'}]

print(list2dict(a))

assert b == list2dict(a)
