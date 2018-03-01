from sys import maxsize as max_int

"""
You are given a list of words (such as might be tokenized
from a paragraph of text), and will provide a method that takes two
words and returns the shortest distance (in words) between those two
words in the provided text.

Example:
    finder = WordDistanceFinder(["the", "quick", "brown", "fox", "quick"]);
    assert(finder.distance("fox", "the") == 3);
    assert(finder.distance("quick", "fox") == 1);
"""


class WordDistanceFinder:
    def __init__(self, words):
        def create_map():
            m = {}
            for i in range(len(words)):
                key = words[i]
                if m.get(key) is not None:
                    m[key].append(i)
                else:
                    m[key] = [i]
            return m

        self.index_map = create_map()

    def distance(self, a, b):
        dist1 = self.index_map.get(a)
        dist2 = self.index_map.get(b)
        if dist1 is None or dist2 is None:
            return None
        min_dist, dist = max_int, 0
        for d1 in dist1:
            for d2 in dist2:
                dist = abs(d1 - d2)
                if dist < min_dist:
                    min_dist = dist
        return min_dist
