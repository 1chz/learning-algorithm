from collections import Counter

def solution(progresses, speeds):
    stack = []

    for i in range(len(progresses)):
        day =0
        while True:
            if progresses[i] >= 100:
                if not stack:
                    stack.append(day)
                    break
                elif stack[i-1] >= day:
                    stack.append(stack[i-1])
                    break
                else:
                    stack.append(day)
                    break
            day += 1
            progresses[i] += speeds[i]

    counter = Counter(stack)

    answer = list(counter.values())

    return answer



print(solution([93, 30, 55], [1, 30, 5]))