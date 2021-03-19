# https://www.acmicpc.net/problem/2914

song_cnt, avg_value = input().split(' ')

print((int(song_cnt) * (int(avg_value)-1))+1)