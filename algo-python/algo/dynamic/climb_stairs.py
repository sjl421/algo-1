
class ClimbStairsBruteForce:

    def climb_stairs(self, n):
        if n < 3:
            return n
        return self.climb_stairs(n - 1) + self.climb_stairs(n - 2)


class ClimbStairsRecursiveMemoization:

    def __init__(self):
        self.memo = {}

    def climb_stairs(self, n):
        if n in self.memo:
            return self.memo[n]
        if n < 3:
            return n
        self.memo[n] = self.climb_stairs(n - 1) + self.climb_stairs(n - 2)
        return self.memo[n]


class ClimbStairsDynamicProgramming:

    @staticmethod
    def climb_stairs(n):
        if n < 3:
            return n
        first = 1
        second = 2
        for i in range(3, n+1):
            third = first + second
            first = second
            second = third
        return second


def test(solution):
    assert 1 == solution.climb_stairs(1)
    assert 2 == solution.climb_stairs(2)
    assert 3 == solution.climb_stairs(3)
    assert 5 == solution.climb_stairs(4)
    assert 8 == solution.climb_stairs(5)
    assert 433494437 == solution.climb_stairs(42)

# exceeds the time limit die to O(2^n) complexity
# test(ClimbStairsBruteForce())


test(ClimbStairsRecursiveMemoization())

test(ClimbStairsDynamicProgramming())
