# coding=utf-8
import unittest

from interview.structures.min_heap import MinHeap


class TestMinHeap(unittest.TestCase):

    def test_remove_min(self):
        heap = MinHeap()
        heap.build_heap([9, 6, 5, 2, 3])

        self.assertEqual(2, heap.remove_min())
        print(heap.items)
