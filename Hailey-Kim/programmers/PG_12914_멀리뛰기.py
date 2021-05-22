def solution(n):
    steps = [0, 1, 2]
    for i in range(3, n+1):
        steps.append((steps[i-1] + steps[i-2])%1234567)

    return steps[n]