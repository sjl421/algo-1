
from unittest import TestCase
from algo.strings.word_distance_finder import WordDistanceFinder


class TestWordDistance(TestCase):

    def test_find_distance(self):
        words = ["the", "quick", "brown", "fox", "quick"]
        finder = WordDistanceFinder(words)
        self.assertEqual(finder.distance("fox", "the"), 3)
        self.assertEqual(finder.distance("quick", "fox"), 1)
        self.assertEqual(finder.distance("quick", "the"), 1)
        self.assertIsNone(finder.distance("fox", "aaa"))
