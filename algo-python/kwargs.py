

class KwargsDemo(object):
    def __init__(self, **kwargs):
        self.kwargs = kwargs

    def hello(self):
        pass

    def test_print(self):
        for key, value in self.kwargs.items():
            print("{}={}".format(key, value))


demo = KwargsDemo(first_name='John', second_name='Doe')
demo.test_print()
