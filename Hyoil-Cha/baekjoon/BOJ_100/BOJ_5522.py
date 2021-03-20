import sys

def solution() :
    sum = 0

    for _ in range(5):
        while True:
            num = int(sys.stdin.readline().strip())

            if 0 <= num and num <= 100:
                break

        sum += num

    print(sum) 

if __name__ == "__main__" :
    solution()