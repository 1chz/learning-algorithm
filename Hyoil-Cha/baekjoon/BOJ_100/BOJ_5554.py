import sys

def solution():

    while True:
        total = 0
        for _ in range(4) :
            num = int(sys.stdin.readline().strip())

            total += num

        if total >= 60 & total <= 3599 :
            break
    print(total // 60)
    print(total % 60)
    
solution()
