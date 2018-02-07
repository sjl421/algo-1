from algo.sorting.abstract_sort import AbstractSort
from algo.sorting.sort_test import test_sort


class BubbleSortMod1(AbstractSort):
    def __init__(self):
        super().__init__()

    def __str__(self):
        return 'bubble sort optimization #1'

    def sort(self, num_list):
        res = num_list[:]
        n = len(res)
        self.stats.data_len = n
        while n > 0:
            last_swap_index = 0
            for i in range(1, n):
                if res[i] < res[i - 1]:
                    self.swap(res, i - 1, i)
                    last_swap_index = i
                self.stats.comparisons += 1
            n = last_swap_index
            self.stats.passes += 1
        return res


bubble_sort = BubbleSortMod1()
test_sort(bubble_sort)
