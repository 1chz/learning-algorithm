from typing import List
# 이진탐색

# 27. 정렬된 배열에서 특정 수의 개수 구하기
def count_specific_number(first: list, array: list) -> int:
    '''
    정렬된 배열에서 특정 수의 개수 구하기
    n개의 원소를 포함하는 오름차순 수열(array)
    x가 등장하는 회수 계산. 없으면 -1
    O(logN) 시간복잡도로 구현
    '''
    import bisect
    n, x = first
    if x not in array:
        return -1
    first_index = bisect.bisect_left(array, x)
    last_index = bisect.bisect_right(array, x)
    return (last_index - first_index) + 1


# 28. 고정점 찾기
def find_fixed_point(n: int, array: list) -> int:
    '''
    고정점: 수열의 원소 중에서 값이 인덱스와 동일한 원소

    수열 array는 총 n개의 원소를 포함함. (오름차순)
    수열에서 고정점이 있다면 이를 반환하고 아니면 -1을 반환 (고정점은 최대 1개)
    O(logN) 시간복잡도로 구현
    '''
    # for문으로 돌리면서 확인하면 시간복잡도에 걸리는듯
    # 오름차순이기 때문에 이진탐색을 통해서 문제풀이
    # 중간값이 index보다 작으면 오른쪽을,
    # 중간값이 index보다 크면 왼쪽을 탐색
    # 반복
    # 1. wile문으로 작성
    start_index = 0
    end_index = len(array) - 1
    while start_index <= end_index:
        # 중간값 찾기
        mid_index = (start_index + end_index) // 2
        # 중간값이 index와 같으면 고정점 반환
        if mid_index == array[mid_index]:
            return array[mid_index]
        # 중간값이 index보다 작으면
        if array[mid_index] < mid_index:
            # 오른쪽 탐색 (start는 end + 1)
            start_index = mid_index + 1
        # 중간값이 index보다 크면
        else:
            # 왼쪽 탐색 (end는 mid - 1)
            end_index = mid_index - 1
    return -1

# 28. 재귀문으로 풀이
def binary_search(array: list, start_index: int, end_index: int):
    if start_index > end_index:
        return -1
    mid_index = (start_index + end_index) // 2
    if array[mid_index] == mid_index:
        return array[mid_index]
    if array[mid_index] < mid_index:
        start_index = mid_index + 1
    else:
        end_index = mid_index - 1
    return binary_search(array, start_index, end_index)

def find_fixed_point_reculsive(n: int, array: list) -> int:
    return binary_search(array, 0, len(array) - 1)


# 29. 공유기 설치
def install_router(home_count: int, router_count: int, home_coordinates: List[int]) -> int:
    '''
    https://www.acmicpc.net/problem/2110
    집 n개가 수직선 위에 있음.
    home_coordinates는 각각의 x좌표 리스트
    한 집에는 공유기를 한개만 설치 가능, 가장 인접한 두 공유기 사이의 거리를 가능한 크게 설정.
    
    router_count(c)개의 공유기를 home_count(n)개의 집에 적당히 설치하여,
    가장 인접한 두 공유기 사이의 최대 거리를 계산
    (공유기 사이의 가장 가까운 거리가 최대값이 되도록)
    '''
    # 정렬
    home_coordinates.sort()
    # [1, 2, 4, 8, 9]
    # [1, 2, 4, 5, 7, 9, 10, 11, 12] / 4개

    # 거리 x만큼으로 모든 공유기를 나열할 수 있는지?
    # - x가 주어졌을 때, 차례대로 x를 더해가면서 검증해야하나?
    # 있다면 x값을 늘림
    # 없다면 x값을 줄임

    start_index = 0
    end_index = len(home_coordinates) - 1
    mid_index = (start_index + end_index) // 2
    distance = 0
    while start_index <= end_index:
        start_value = home_coordinates[start_index]
        mid_value = home_coordinates[mid_index]
        # 중간값과의 거리 계산
        distance = mid_value - start_value
        # 거리 x만큼으로 모든 공유기를 나열할 수 있는지?
        # 가장 처음 값부터 시작
        prev_value = start_value
        # 값에서 거리를 더한 값의 index 찾기
        for i in range(len(router_count)) -1:
            start_value + distance

    # 아니면 이진탐색으로 1씩 더해가면서 해야하나?

