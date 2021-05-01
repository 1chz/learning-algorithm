# Programmers 2020 KAKAO BLIND RECRUITMENT - 가사 검색 Lv4
# https://programmers.co.kr/learn/courses/30/lessons/60060

# 이분탐색으로 풀이
import bisect


def solution(words, queries):
    answer = []
    # 단어 길이에 따른 분류를 위한 리스트
    wrds = [[] for _ in range(10001)]
    wrds_reverse = [[] for _ in range(10001)]  # 접두사로 ?가 올 경우 뒤집어서 판단하기 위함

    for word in words:
        wrds[len(word)].append(word)
        wrds_reverse[len(word)].append(word[::-1])

    # 이분탐색을 위한 정렬. (길이 별 원소 ex. 길이가1, 길이가 2... 길이가 10001 인 리스트 원소들)
    for i in range(10001):
        wrds[i].sort()
        wrds_reverse[i].sort()

    # fro??라면 froaa ~ frozz의 범위에서 값 이분탐색
    # upper_bound - lower_bound = 개수
    for quer in queries:
        left = quer.replace("?", "a")
        right = quer.replace("?", "z")
        # 접두어가 ?면
        if quer[0] == "?":
            left = quer[::-1].replace("?", "a")
            right = quer[::-1].replace("?", "z")
            res = bisect.bisect_right(wrds_reverse[len(
                quer)], right) - bisect.bisect_left(wrds_reverse[len(quer)], left)
            answer.append(res)
            continue

        res = bisect.bisect_right(
            wrds[len(quer)], right) - bisect.bisect_left(wrds[len(quer)], left)
        answer.append(res)
    return answer


if __name__ == "__main__":
    print(solution(["frodo", "front", "frost", "frozen", "frame", "kakao"],
                   ["fro??", "????o", "fr???", "fro???", "pro?"]))
