from unittest import TestCase

from boj100 import *

class BOJ100TestCase(TestCase):
    def test_14645(self):
        self.assertEqual(boj14645.solution(3, 2), '비와이')

