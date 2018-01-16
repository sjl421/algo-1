# coding=utf-8

"""
Basic implementation of depth-first search algorithm
featuring Python's generators.

https://jeremykun.com/2013/01/22/depth-and-breadth-first-search/
https://en.wikipedia.org/wiki/Connected_component_(graph_theory)
https://wiki.python.org/moin/Generators
"""


def depth_first(graph, start):
    visited, stack = set(), [start]
    while stack:
        node = stack.pop()
        if node not in visited:
            visited.add(node)
            stack.extend(graph[node] - visited)
    return visited


def depth_first_recursive(graph, start, visited=None):
    """ dfs in recursive style """
    if not visited:
        visited = set()
    visited.add(start)
    for next_node in graph[start] - visited:
        depth_first_recursive(graph, next_node, visited)
    return visited


def depth_first_paths(graph, start, goal):
    stack = [(start, [start])]
    while stack:
        node, path = stack.pop()
        for next_node in graph[node] - set(path):
            if next_node == goal:
                yield path + [next_node]
            else:
                stack.append((next_node, path + [next_node]))


TEST_GRAPH = {'A': {'B', 'C'},
              'B': {'A', 'D', 'E'},
              'C': {'A', 'F'},
              'D': {'B', 'Z'},
              'E': {'B', 'F'},
              'F': {'C', 'E'},
              'Z': set()}


def test_dfs(solution):
    print('\nTesting:', solution.__name__)
    g = TEST_GRAPH
    print('path from A: ', solution(g, 'A'))
    print('path from Z: ', solution(g, 'Z'))


def test_paths():
    print('\nTesting: depth_first_paths')
    print(list(depth_first_paths(TEST_GRAPH, 'A', 'F')))


if __name__ == '__main__':
    test_dfs(depth_first)
    test_dfs(depth_first_recursive)
    test_paths()
