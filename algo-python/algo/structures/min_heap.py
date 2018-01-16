# coding=utf-8

"""
Basic implementation of a binary heap (min heap)
https://en.wikipedia.org/wiki/Binary_heap
"""


class MinHeap:

    def __init__(self, items_list=None):
        if items_list:
            self.build_heap(items_list)
        else:
            self.items = [0]
            self.size = 0

    def add(self, value):
        self.items.append(value)
        self.size += 1
        self._percolate_up(self.size)

    def build_heap(self, items_list):
        self.size = len(items_list)
        mid_index = self.size // 2
        self.items = [0] + items_list[:]
        while mid_index > 0:
            self._percolate_down(mid_index)
            mid_index -= 1

    def remove_min(self):
        min_value = self.items[1]
        self.items[1] = self.items[self.size]
        self.size -= 1
        self.items.pop()
        self._percolate_down(1)
        return min_value

    def _percolate_up(self, index):
        parent = index // 2
        while parent > 0 and self.items[index] < self.items[parent]:
            self._swap(parent, index)
            index = parent
            parent = index // 2
        return index

    def _percolate_down(self, index):
        def min_child_index(i):
            child = i * 2
            if child > self.size:
                return None
            if child + 1 > self.size:
                return child
            return child if self.items[child] < self.items[child + 1] else child + 1

        while index * 2 <= self.size:
            min_child = min_child_index(index)
            if self.items[index] > self.items[min_child]:
                self._swap(index, min_child)

            index = min_child

    def _swap(self, i, j):
        tmp = self.items[i]
        self.items[i] = self.items[j]
        self.items[j] = tmp
