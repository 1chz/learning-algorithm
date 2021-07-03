K, N = map(int, input().split())

cable = [int(input()) for _ in range(K)]

#print(cable)
#K를 잘라서 N 랜선들을 만든다. 
#랜선의 길이가 기준? 초기 랜선 길이는 K랜선들중 가장 짧은 랜선
#N개 이상을 만족하면서 길이가 최대인 경우
# 이분탐색으로 움직이는 리스트는 [1 ~ min(cable)]
#print(find)

def binary_search():
    start = 1
    ans = 0
    end = max(cable)
    while start <= end:
        mid = (start+end) // 2
        cnt = 0
        #print(cable_len)
        for i in cable:
            cnt += i // mid
                #각 케이블의 길이가 자르는 랜선보다 작을때까지
        if cnt >= N:
            start = mid +1
        else:
            end = mid-1
    return end

print(binary_search())
#feat(Jeongmu-Jo): [BOJ, 1654] 랜선 자르기