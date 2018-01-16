# coding=utf-8
from algo.hash.base62 import decimal_to_base62, base62_to_decimal


class TinyUrlService:

    def __init__(self):
        self.long_to_short = {}
        self.short_to_long = {}
        self.counter = 10000    # let's start from some big number to get nice tiny urls
        self.base_url = 'http://tiny.url/'

    def encode_url(self, url):
        url_short = decimal_to_base62(self.counter)
        self.long_to_short[url] = self.counter
        self.short_to_long[self.counter] = url
        self.counter += 1
        return self.base_url + url_short

    def decode_url(self, short_url):
        index_from = len(self.base_url)
        encoded_part = short_url[index_from:]
        url_id = base62_to_decimal(encoded_part)
        return self.short_to_long[url_id]


def test():
    service = TinyUrlService()

    long_url = 'https://docs.python.org/3/library/ctypes.html#accessing-functions-from-loaded-dlls'
    tiny_url = service.encode_url(long_url)

    print('long url:', long_url)
    print('tiny url:', tiny_url)

    assert long_url == service.decode_url(tiny_url)


if __name__ == '__main__':
    test()
