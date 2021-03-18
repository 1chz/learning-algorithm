import unittest

from study import *


class QuestionTestCase(unittest.TestCase):

    # 27
    def test_count_specific_number(self):
        self.assertEqual(count_specific_number([7, 2], [1, 1, 2, 2, 2, 3]), 4)
        self.assertEqual(count_specific_number([7, 4], [1, 1, 2, 2, 2, 3]), -1)

    # 28
    def test_find_fixed_point(self):
        # wilhe
        self.assertEqual(find_fixed_point(5, [-15, 6, 1, 3, 7]), 3)
        self.assertEqual(find_fixed_point(7, [-15, -4, 2, 8, 9, 13, 15]), 2)
        self.assertEqual(find_fixed_point(7, [-15, -4, 3, 8, 9, 13, 15]), -1)
        # 재귀
        self.assertEqual(find_fixed_point_reculsive(5, [-15, 6, 1, 3, 7]), 3)
        self.assertEqual(find_fixed_point_reculsive(7, [-15, -4, 2, 8, 9, 13, 15]), 2)
        self.assertEqual(find_fixed_point_reculsive(7, [-15, -4, 3, 8, 9, 13, 15]), -1)

    # 29. 공유기 설치
    @unittest.skip('cannot solved')
    def test_install_router(self):
        home_count, router_count = 5, 3
        home_coordinates: list = [1, 2, 8, 4, 9]
        self.assertEqual(install_router(home_count, router_count, home_coordinates), 3)

    # 구현: 상하좌우
    def test_move(self):
        n = 5
        plans = ['R', 'R', 'R', 'U', 'D', 'D']

        self.assertEqual(move(n, plans), [3, 4])

    # 구현 연습문제: 시각
    def test_time(self):
        self.assertEqual(time_solution(5), 11475)

    # 구현 연습문제: 체스나이트
    def test_chess_night(self):
        self.assertEqual(chess_night('c2'), 6)
        self.assertEqual(chess_night('a1'), 2)

    # 문자열 재정렬
    def test_string_reorder(self):
        self.assertEqual(string_reorder('K1KA5CB7'), 'ABCKK13')
        self.assertEqual(string_reorder('AJKDLSI412K4JSJ9D'), 'ADDIJJJKKLSS20')

    def test_flood_fill(self):
        images = [[1,1,1],[1,1,0],[1,0,1]]
        # self.assertEqual(flood_fill(images, 1, 1, 2), [[2,2,2,],[2,2,0],[2,0,1]])
        self.assertEqual(
            flood_fill([[0,0,0],[0,0,1]], sr=1, sc=0, newColor=2),
            [[2,2,2],[2,2,1]]
        )

