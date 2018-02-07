from abc import abstractmethod

from algo.sorting.sort_stat import SortStat


class AbstractSort:

    def __init__(self):
        self.__stats = SortStat()

    @abstractmethod
    def sort(self, num_list):
        pass

    @abstractmethod
    def __str__(self):
        return 'AbstractSort'

    def swap(self, a_list, i, j):
        tmp = a_list[i]
        a_list[i] = a_list[j]
        a_list[j] = tmp
        self.__stats.swaps += 1

    @property
    def stats(self):
        return self.__stats
