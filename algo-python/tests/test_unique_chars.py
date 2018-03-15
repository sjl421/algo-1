
from unittest import TestCase
from algo.strings.unique_chars import is_unique


class TestUniqueChars(TestCase):

    def test_is_unique_empty_string(self):
        self.assertTrue(is_unique(''))

    def test_is_unique(self):
        self.assertTrue(is_unique("a"))
        self.assertTrue(is_unique("abc"))
        self.assertFalse(is_unique("aba"))
        self.assertTrue(is_unique("123abcABC"))
