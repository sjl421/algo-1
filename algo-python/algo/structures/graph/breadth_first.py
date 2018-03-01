from collections import deque

"""
Basic implementation of breadth-first search algorithm, featuring
collections.deque as the implementation of a queue and Python's generators.

https://jeremykun.com/2013/01/22/depth-and-breadth-first-search/
"""


def breadth_first(graph, start):
    visited, queue = set(), deque([start])
    while len(queue) > 0:
        node = queue.pop()
        if node not in visited:
            visited.add(node)
            queue.extendleft(graph[node] - visited)
    return visited


def breadth_first_paths(graph, start, goal):
    queue = deque([(start, [start])])
    while queue:
        node, path = queue.pop()
        for next_node in graph[node] - set(path):
            if next_node == goal:
                yield path + [next_node]
            else:
                queue.appendleft((next_node, path + [next_node]))


def shortest_path(graph, start, goal):
    queue = deque([(start, [start])])
    while queue:
        node, path = queue.pop()
        for next_node in graph[node] - set(path):
            if next_node == goal:
                return path + [next_node]
            else:
                queue.appendleft((next_node, path + [next_node]))


TEST_GRAPH = {'A': {'B', 'C'},
              'B': {'A', 'D', 'E'},
              'C': {'A', 'F'},
              'D': {'B', 'X'},
              'E': {'B', 'F'},
              'F': {'C', 'E'},
              'X': {'Y'},
              'Y': set()}


def test():
    g = TEST_GRAPH

    print('Breadth first search: ')
    print('starting from A:', breadth_first(g, 'A'))
    print('starting from D:', breadth_first(g, 'D'))
    print('starting from X:', breadth_first(g, 'X'))

    print('\nBFS paths:')
    print('A->Y:', list(breadth_first_paths(g, 'A', 'Y')))
    print('A->F:', list(breadth_first_paths(g, 'A', 'F')))

    print('\nShortest path:')
    path = shortest_path(g, 'A', 'F')
    print('A->F:', path)
    assert 3 == len(path)

    path = shortest_path(g, 'E', 'X')
    print('E->X:', path)
    assert 4 == len(path)


if __name__ == '__main__':
    test()
