from unittest import TestCase

from interview.arrays.search_peak import SearchPeak


class TestSearchPeak(TestCase):
    def test_find_peak_empty_array(self):
        self.assertEqual(SearchPeak.find_peak([]), -1)

    def test_find_peak(self):
        numbers = [-1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 0]
        self.assertEqual(SearchPeak.find_peak(numbers), 7)
