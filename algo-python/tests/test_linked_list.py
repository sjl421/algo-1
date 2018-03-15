from unittest import TestCase

from algo.structures.linked_list import LinkedList


class TestLinkedList(TestCase):

    def test_append(self):
        ll = LinkedList()
        self.assertIsNone(ll.head)

        ll.append(1)
        ll.append(2)

        self.assertEqual(1, ll.head.value)
        self.assertEqual(2, ll.head.next.value)
        self.assertIsNone(ll.head.next.next)

    def test_get(self):
        ll = LinkedList()
        self.assertIsNone(ll.get(1))

        ll.append("hello")
        ll.append("there")

        self.assertEqual("hello", ll.get(1))
        self.assertEqual("there", ll.get(2))
        self.assertIsNone(ll.get(0))
        self.assertIsNone(ll.get(42))

    def test_insert(self):
        ll = LinkedList()
        ll.append("I")
        ll.append("climbing")

        self.assertTrue(ll.insert(2, "love"))

        self.assertEqual("I", ll.head.value)
        self.assertEqual("love", ll.head.next.value)
        self.assertEqual("climbing", ll.head.next.next.value)

        self.assertTrue(ll.insert(1, "Yes, "))

        self.assertEqual("Yes, ", ll.head.value)
        self.assertEqual("I", ll.head.next.value)

    def test_delete_empty_list(self):
        ll = LinkedList()
        ll.delete("test")

    def test_delete_head(self):
        ll = LinkedList()
        ll.append("head")

        ll.delete("head")
        self.assertIsNone(ll.head)

    def test_delete(self):
        ll = LinkedList()
        ll.append(1)
        ll.append(2)
        ll.append(3)
        ll.append(4)

        # delete the first item
        ll.delete(1)

        self.assertEqual(2, ll.head.value)
        self.assertEqual(3, ll.head.next.value)

        # delete from the middle
        ll.delete(3)

        self.assertEqual(2, ll.head.value)
        self.assertEqual(4, ll.head.next.value)
        self.assertIsNone(ll.head.next.next)

        # delete the last item
        self.assertTrue(ll.delete(4))
        self.assertEqual(2, ll.head.value)
        self.assertIsNone(ll.head.next)
