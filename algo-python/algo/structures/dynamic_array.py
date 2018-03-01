import ctypes


def create_array(new_capacity):
    return (new_capacity * ctypes.py_object)()


class DynamicArray:

    def __init__(self, initial_capacity=10, growth_factor=2):
        self.size = 0
        self.capacity = initial_capacity
        self.growth_factor = growth_factor
        self.elements = create_array(self.capacity)

        # stats
        self.number_of_doubles = 0
        self.potential = 0

    def __len__(self):
        return self.size

    def __getitem__(self, index):
        if not (0 <= index < self.size):
            raise IndexError('index is out of bounds')
        return self.elements[index]

    def append(self, element):
        if self.size == self.capacity:
            self._grow()

        self.elements[self.size] = element
        self.size += 1

        # stats
        self.potential += 2

    def _grow(self):
        new_capacity = int(self.capacity * self.growth_factor)
        new_array = create_array(new_capacity)
        for index in range(self.size):
            new_array[index] = self.elements[index]
            # stats
            self.potential -= 1
            assert self.potential >= 0, \
                '{} is negative when trying to grow from {} to {}'\
                .format(self.potential, self.capacity, new_capacity)

        self.elements = new_array
        self.capacity = new_capacity
        self.number_of_doubles += 1
