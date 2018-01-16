# coding=utf-8
import itertools


def get_sum(hh, mm, ss):
    return hh * 10000 + mm * 100 + ss


def format_time(time):
    return '{:02d}'.format(time)


def earliest_time(a, b, c, d, e, f):
    min_sum = get_sum(24, 60, 60)
    min_time = None
    for p in itertools.permutations([a, b, c, d, e, f]):
        hh = p[0] * 10 + p[1]
        if hh < 24:
            mm = p[2] * 10 + p[3]
            if mm < 60:
                ss = p[4] * 10 + p[5]
                if ss < 60:
                    time_sum = get_sum(hh, mm, ss)
                    if time_sum < min_sum:
                        min_sum = time_sum
                        min_time = (hh, mm, ss)

    if min_time is None:
        return 'not_possible'

    return ':'.join(map(format_time, min_time))


assert '00:00:00' == earliest_time(0, 0, 0, 0, 0, 0)

assert '00:00:01' == earliest_time(0, 1, 0, 0, 0, 0)

assert '23:59:59' == earliest_time(2, 3, 9, 9, 5, 5)

assert '12:36:48' == earliest_time(2, 1, 3, 8, 6, 4)

assert "07:08:09" == earliest_time(0, 0, 0, 7, 8, 9)

assert '16:39:49' == earliest_time(9, 9, 3, 4, 6, 1)

assert 'not_possible' == earliest_time(9, 9, 3, 4, 6, 3)
