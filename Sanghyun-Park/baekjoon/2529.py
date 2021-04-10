import sys
from collections import deque

number=[i for i in range(10)]

k=int(sys.stdin.readline())

parse=list(sys.stdin.readline().split())



num=[] #완성된 숫자

def find_num(k,parse,number,temp):
    if parse==[]:
        wd=''
        for i in temp:
            wd+=str(i)
        num.append(wd)
        temp.clear()
        return

    c_parse=[]+parse
    c_number=[]+number
    c_temp=[]+temp

    if temp==[]:
        for i,val in enumerate(c_number):
            temp.append(val)
            number.remove(val)
            find_num(k-1,parse,number,temp)
            temp=[]+c_temp
            number=[]+c_number
    elif parse[0]=='>':
        for i,val in enumerate(c_number):
            if val<temp[-1]:
                temp.append(val)
                number.remove(val)
                find_num(k - 1, parse[1:], number, temp)
                temp = [] + c_temp
                number = [] + c_number
    else:
        for i,val in enumerate(c_number):
            if temp[-1]<val:
                temp.append(val)
                number.remove(val)
                find_num(k - 1, parse[1:], number, temp)
                temp = [] + c_temp
                number = [] + c_number






find_num(k+1,parse,number,[])

print(max(num),min(num),sep='\n')


#
# num = int(input())
# op = input().split()
# check = [False] * 10
# mx , mn = "",""
# def poss(i,j,k): # 부등호 조건이  만족할 때만 작동
#     if k == ">":
#         return i>j
#     else:
#         return i<j
#
#
# def recu(cnt, s):
#     global mx,mn
#     if cnt > num: #맨처음 나타나는 값이 최소, 마지막 저장되는 것이 최대
#         if len(mn) == 0:
#             mn = s
#         else:
#             mx = s
#         return
#     for i in range(10): #재귀 함수
#         if check[i] == False:
#             if cnt == 0 or poss(s[-1],str(i),op[cnt-1]):
#                 check[i] = True
#                 recu(cnt+1,s+str(i))
#                 check[i] = False
#
# recu(0,"")
# print(mx)
# print(mn)