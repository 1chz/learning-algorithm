from unittest import TestCase

from boj100 import *

class BOJ100TestCase(TestCase):
    def test_14645(self):
        self.assertEqual(boj14645.solution(3, 2), '비와이')

    def test_5522(self):
        self.assertEqual(boj5522.solution([1, 2, 3, 4, 5]), 15)

    def test_5554(self):
        self.assertEqual(boj5554.solution([31, 34, 7, 151]), [3, 43])

    def test_18108(self):
        self.assertEqual(boj18108.solution(2541), 1998)

    def test_18108(self):
        self.assertEqual(boj18108.solution(2541), 1998)

    # 16394
    def test_16394(self):
        self.assertEqual(boj16394.solution(2018), 72)

    # 15733
    def test_15733(self):
        self.assertEqual(boj15733.solution(), "I'm Sexy")

    # 16430
    def test_16430(self):
        self.assertEqual(boj16430.solution([2, 7]), [5, 7])
