def solution(n, times):
    left = 0
    right = max(times) * n

    answer = right

    while left <= right:
        mid = (left + right)//2
        count = 0

        for i in times:
            count += mid // i

        if count < n:  # impossibile
            left = mid + 1
        else:  # possible
            right = mid - 1
            if answer > mid:
                answer = mid

    return answer
