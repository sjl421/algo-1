# coding=utf-8


class BannerService:

    def __init__(self, banners):
        self.banners = banners
        self.hits = {}

    def print_images(self, k):
        ids = self.get_banners(k)
        for banner_id in ids:
            print('banner: <img>{}</img>'.format(banner_id))

    def get_banners(self, banners_num):
        # result = [0] * banners_num
        # for i in range(banners_num):
        #    for banner_id, weight in self.banners.items():
        #        if banner_id not in result
        return []


service = BannerService({1000: 2, 1001: 4, 1002: 8, 1003: 2})
service.print_images(2)
