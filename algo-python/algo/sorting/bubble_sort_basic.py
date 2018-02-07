from algo.sorting.abstract_sort import AbstractSort
from algo.sorting.sort_test import test_sort


class BubbleSortBasic(AbstractSort):
    def __init__(self):
        super().__init__()

    def __str__(self):
        return 'bubble sort basic'

    def sort(self, num_list):
        swapped = True
        res, n = num_list[:], len(num_list)
        self.stats.data_len = n
        while swapped:
            swapped = False
            for i in range(1, n):
                if res[i] < res[i - 1]:
                    self.swap(res, i - 1, i)
                    swapped = True
                self.stats.comparisons += 1
            self.stats.passes += 1
        return res


bubble_sort = BubbleSortBasic()
test_sort(bubble_sort)
