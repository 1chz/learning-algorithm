def swap(data, i, j):
    if (i != j):
        tmp = data[i]
        data[i] = data[j]
        data[j] = tmp
        
def Permutation(resultArray, data, depth, n, r):
    if (depth == r):
        num = 0
        for i in range(r):
            num = num * 10 + data[i]
        resultArray.append(num)
    
    for i in range(depth,n):
        swap(data, i, depth)
        Permutation(resultArray,  data, depth+1, n, r)
        swap(data, i, depth)
    return resultArray