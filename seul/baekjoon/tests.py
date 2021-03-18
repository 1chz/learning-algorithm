from unittest import TestCase

from boj100 import *

class BOJ100TestCase(TestCase):
    def test_14645(self):
        self.assertEqual(boj14645.solution(3, 2), '비와이')

    def test_5522(self):
        self.assertEqual(boj5522.solution([1, 2, 3, 4, 5]), 15)
