# coding=utf-8
from unittest import TestCase

from interview.arrays.missing_item import find_missing_item


class TestMissingItem(TestCase):

    def test_find_empty_arrays(self):
        self.assertIsNone(find_missing_item([], []))

    def test_find_empty_b(self):
        self.assertEqual(2, find_missing_item([2], []))

    def test_find(self):
        a = [4, 1, 0, 2, 9, 2, 6, 8, 7, 5, 3]
        b = [6, 4, 7, 2, 1, 0, 2, 8, 3, 9]
        self.assertEqual(5, find_missing_item(a, b))
