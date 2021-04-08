import sys


N=int(sys.stdin.readline())

arr=list(map(int,sys.stdin.readline().split()))



max_1=0



def find_max(arr,compare,n):
    global max_1
    c_arr=[]+arr
    c_compare=[]+compare
    c_n=n

    for i in range(n):
        arr=[]+c_arr
        compare=[]+c_compare
        n=c_n

        compare.append(arr[i])
        arr.remove(arr[i])

        if(len(arr)==0):
            num=0
            for i in range(len(compare)-1):
                if compare[i] - compare[i + 1] > 0:
                    num += compare[i] - compare[i + 1]
                else:
                    num += compare[i + 1] - compare[i]
            max_1=max(max_1,num)
            return
        find_max(arr,compare,n-1)








find_max(arr,[],N)
print(max_1)

