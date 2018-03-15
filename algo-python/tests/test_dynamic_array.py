import unittest

from algo.structures.dynamic_array import DynamicArray


class TestDynamicArray(unittest.TestCase):

    def test_append(self):
        a = DynamicArray()
        a.append(42)
        self.assertEqual(1, len(a))
        self.assertEqual(42, a[0])

        a.append(43)
        self.assertEqual(2, len(a))
        self.assertEqual(43, a[1])


if __name__ == '__main__':
    unittest.main()
