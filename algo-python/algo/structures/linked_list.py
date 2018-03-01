
class Element:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, head=None):
        self.head = head

    def append(self, value):
        new_element = Element(value)
        current = self.head
        if self.head is None:
            self.head = new_element
        else:
            while current.next:
                current = current.next
            current.next = new_element
        return new_element

    def get(self, position):
        if position < 1:
            return None
        counter = 1
        current = self.head
        while current:
            if counter == position:
                return current.value
            current = current.next
            counter += 1
        return None

    def insert(self, position, value):
        if position == 1:
            return self.insert_first(value)
        elif position > 1:
            new_element = Element(value)
            counter = 1
            current = self.head
            while current and counter < position:
                if counter == position - 1:
                    new_element.next = current.next
                    current.next = new_element
                    return new_element
                current = current.next
                counter += 1
        return None

    def insert_first(self, value):
        element = Element(value)
        element.next = self.head
        self.head = element
        return element

    def delete(self, value):
        """ Delete the first node with a given value """
        previous, current = self._find(value)
        if current is None:
            return None
        if previous is None:    # delete head
            self.head = current.next
        elif current:
            previous.next = current.next
            current.next = None
        return current

    def delete_first(self):
        """ Delete the first node """
        if self.head is None:
            return None
        old_head = self.head
        second = old_head.next
        old_head.next = None
        self.head = second
        return old_head

    def _find(self, value):
        current = self.head
        previous = None
        while current:
            if current.value == value:
                return previous, current
            previous = current
            current = current.next
        return None, None
