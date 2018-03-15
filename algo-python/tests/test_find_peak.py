
from unittest import TestCase
from algo.arrays.find_peak import find_peak


class TestFindPeak(TestCase):
    def test_find_peak_empty_array(self):
        self.assertEqual(find_peak([]), -1)

    def test_find_peak(self):
        numbers = [-1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 0]
        self.assertEqual(find_peak(numbers), 7)
