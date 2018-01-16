# coding=utf-8

"""
Implementation of a graph using adjacency list
"""


class Vertex:

    def __init__(self, key):
        self.id = key
        self.connected_to = {}

    def add_neighbour(self, vertex, weight=0):
        self.connected_to[vertex] = weight

    def get_connections(self):
        return self.connected_to.keys()

    def get_id(self):
        return self.id

    def get_weight(self, neighbour):
        return self.connected_to[neighbour]

    def __str__(self):
        return str(self.id) + ' connected to: ' + str([v.id for v in self.connected_to])


class Graph:

    def __init__(self):
        self.vertices = {}  # adjacency list
        self.numVertices = 0

    def add_vertex(self, key):
        self.numVertices += 1
        new_vertex = Vertex(key)
        self.vertices[key] = new_vertex
        return new_vertex

    def get_vertex(self, key):
        return self.vertices[key] if key in self.vertices else None

    def add_edge(self, key_from, key_to, cost=0):
        if key_from not in self.vertices:
            self.add_vertex(key_from)

        if key_to not in self.vertices:
            self.add_vertex(key_to)

        self.vertices[key_from].add_neighbour(self.vertices[key_to], cost)

    def get_vertices(self):
        return self.vertices.keys()

    def __iter__(self):
        return iter(self.vertices.values())

    def __contains__(self, key):
        return key in self.vertices

    def __str__(self):
        return str()


def test():
    g = Graph()
    for i in range(6):
        g.add_vertex(i)

    print(g.get_vertices())

    g.add_edge(0, 1, 2)

    for vertex in g:
        print(vertex)


if __name__ == '__main__':
    test()
