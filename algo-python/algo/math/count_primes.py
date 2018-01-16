
def count_primes(n):
    """
    Sieve of Eratosthenes
    :param n: all primes less than n
    :return:
    """
    if n < 3:
        return 0

    primes = [True]*n
    primes[0] = False
    primes[1] = False

    i = 2
    while i * i < n:
        if primes[i]:
            j = i * i
            while j < n:
                primes[j] = False
                j += i
        i += 1

    count = 0
    for is_prime in primes:
        if is_prime:
            count += 1

    return count


assert 0 == count_primes(1)
assert 0 == count_primes(2)
assert 1 == count_primes(3)
assert 2 == count_primes(4)
assert 2 == count_primes(5)
assert 8 == count_primes(20)
