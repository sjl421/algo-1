class SortStat:

    def __init__(self, test_data_length=0):
        self.data_len = test_data_length
        self.comparisons = 0
        self.passes = 0
        self.swaps = 0

    def print(self):
        stat_str = 'N={} P={}'.format(self.data_len, self.passes)
        if self.data_len >= 1000:
            stat_str += ' C={}K'.format(self.comparisons // 1000)
        else:
            stat_str += ' C={}'.format(self.comparisons)
        stat_str += ' S={}'.format(self.swaps)
        print(stat_str)

    @staticmethod
    def print_notation():
        print("""
Notation:
N is length of test data
P is number of passes made
C is number of comparisons made
S is swaps
""")
