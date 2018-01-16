# coding=utf-8

from collections import OrderedDict
from enum import Enum

"""
Simple implementation of a directed graph
"""


class State(Enum):
    unvisited = 1
    visiting = 2
    visited = 3


class Node:

    def __init__(self, key):
        self.key = key
        self.state = State.unvisited
        self.adjacent = OrderedDict()

    def add_adjacent(self, node, weight=0):
        self.adjacent[node] = weight

    def __str__(self):
        return str(self.key)


class Graph:

    def __init__(self):
        self.nodes = OrderedDict()

    def add_node(self, key):
        node = Node(key)
        self.nodes[key] = node
        return node

    def add_edge(self, source_key, dest_key, weight=0):
        if source_key not in self.nodes:
            self.add_node(source_key)

        if dest_key not in self.nodes:
            self.add_node(dest_key)

        adjacent = self.nodes[dest_key]
        self.nodes[source_key].add_adjacent(adjacent, weight)


def test():
    g = Graph()
    g.add_edge(0, 1, 5)
    print(g.nodes)

    g.add_edge(1, 2, 3)
    print(g.nodes)


if __name__ == '__main__':
    test()
