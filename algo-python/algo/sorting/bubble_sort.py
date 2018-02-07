import random
import timeit

from algo.sorting.sort_stat import SortStat


def swap(arr, i, j):
    tmp = arr[i]
    arr[i] = arr[j]
    arr[j] = tmp


def bubble_sort_naive(num_list):
    swapped = True
    result, n = num_list[:], len(num_list)
    stat = SortStat(n)
    while swapped:
        swapped = False
        for i in range(1, n):
            if result[i] < result[i - 1]:
                swap(result, i - 1, i)
                swapped = True
            stat.comparisons += 1
        stat.passes += 1

    return result, stat


def bubble_sort_optimization1(num_list):
    result = num_list[:]
    n = len(result)
    stat = SortStat(n)
    while n > 0:
        last_swap_index = 0
        for i in range(1, n):
            if result[i] < result[i - 1]:
                swap(result, i - 1, i)
                last_swap_index = i
            stat.comparisons += 1
        n = last_swap_index
        stat.passes += 1
    return result, stat


def test_sort(sort_fun):
    test_cases = [
        [0],
        [1, 0],
        [2, 1, 0],
        [5, 4, 3, 2, 1],
        [2, 3, 5, 4, 1, 0, 1, 9, 6],
        random.sample(range(1000), 1000)
    ]

    print("\ntesting: {}".format(sort_fun.__name__, ))
    print('statistics:')
    for test_data in test_cases:
        expected = sorted(test_data)
        actual, stat = sort_fun(test_data)
        assert expected == actual
        stat.print()


test_sort(bubble_sort_naive)
test_sort(bubble_sort_optimization1)

SortStat.print_notation()


print("""
Benchmark test
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
