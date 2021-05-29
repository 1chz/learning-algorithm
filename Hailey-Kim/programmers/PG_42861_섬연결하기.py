'''
Connecting Islands

Given the number of islands (n) and the costs of connecting roads,
return the minimum total cost required to connect all islands.

An element in costs is given as [island to be connected, island to be connected, cost]

programmers.co.kr/learn/courses/30/lessons/42861

03/14/21
'''

# Union-Find Method
# get the  (smallest) parent node #

def getParent(parent, x):
    if parent[x] == x:
        return x
    return getParent(parent, parent[x])

# given two nodes to be connected, update their parents


def unionParent(parent, a, b):
    a = getParent(parent, a)
    b = getParent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

# compare parent nodes of the given two nodes
# to see if they share the same parent - in this case, a cycle will be made

def compareParent(parent, a, b):
    a = getParent(parent, a)
    b = getParent(parent, b)
    if a == b:
        return True
    else:
        return False

# main function

def solution(n, costs):
    answer = 0
    count = 0

    # initialize parent-node table
    parent = [0] * n
    for i in range(n):
        parent[i] = i

    # sort the costs table per cost
    costs.sort(key=lambda x: x[2])

    # if a edge does not make a cycle, add
    for x in costs:
        if not compareParent(parent, x[0], x[1]):
            answer += x[2]
            unionParent(parent, x[0], x[1])
            count += 1

        # if # of edges = n - 1, it's the best
        if count == n - 1:
            break

    return answer