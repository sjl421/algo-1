import random
import timeit

print("""
Benchmark tests
""")


def test_time(sort_fun, n):
    data = random.sample(range(n), n)
    sort_fun(data)


time = timeit.timeit("test_time(bubble_sort_naive, 100)",
                     setup="from __main__ import test_time,bubble_sort_naive", number=1000)
print('bubble sort 1: {}'.format(time))


time = timeit.timeit("test_time(bubble_sort_optimization1, 100)",
                     setup="from __main__ import test_time,bubble_sort_optimization1", number=1000)
print('bubble sort 2: {}'.format(time))
