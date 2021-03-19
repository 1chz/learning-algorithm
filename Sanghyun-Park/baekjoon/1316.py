import sys

n=int(sys.stdin.readline())
num=n
def find_groupword(word):

    arr={}
    for i,lett in enumerate(word):

        if lett not in arr:
            arr[lett]=1
        elif lett in arr and word[i-1]==lett :
            continue
        else:
            arr[lett]=0
    global num
    for key,val in arr.items():
        if val==0:
            num-=1
            return


for i in range(n):
    word=sys.stdin.readline().replace("\n",'')
    find_groupword(word)
print(num)
