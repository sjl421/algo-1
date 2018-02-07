import random


TESTS = [
    [0],
    [1, 0],
    [2, 1, 0],
    [5, 4, 3, 2, 1],
    [2, 3, 5, 4, 1, 0, 1, 9, 6],
    random.sample(range(1000), 1000)
]


def test_sort(algorithm):
    print("\nTesting: {}".format(algorithm))
    print('Statistics:')
    for test_data in TESTS:
        expected = sorted(test_data)
        actual = algorithm.sort(test_data)
        assert expected == actual
        algorithm.stats.print()

    algorithm.stats.print_notation()
