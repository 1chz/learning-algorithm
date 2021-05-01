import sys



arr=[]
for i in range(9):
    arr.append(int(sys.stdin.readline()))



check=0
def find_dwarf(arr,dwarf,c_sum):
    temp=c_sum
    temp_d=[]+dwarf
    temp_arr=[]+arr

    for i,val in enumerate(arr):
        c_sum=temp
        dwarf=[]+temp_d
        arr=[]+temp_arr
        global check
        if  check ==1:
            return
        c_sum+=val
        dwarf.append(val)
        if c_sum==100 and len(dwarf)==7:
            for i in sorted(dwarf) :
                print(i)
            check=1
        elif c_sum>100:
            pass
        else:
            if i+1<=8:
                find_dwarf(arr[i+1:],dwarf,c_sum)
            else:
                pass

find_dwarf(arr,[],0)