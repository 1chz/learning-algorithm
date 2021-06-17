"""
Smallest Difference

06/17/2021

"""
def smallestDifference(arrayOne, arrayTwo):
    # O(mlog(m) + nlog(n)) T, O(1) S
    arrayOne.sort()
    arrayTwo.sort()

    n = len(arrayOne)
    i, j = 0, 0
    currMin = [float("inf"),float("inf")]

    while i < len(arrayOne) and j < len(arrayTwo):
        top, bot = arrayOne[i], arrayTwo[j]
        if top == bot:
            return [top, bot]
        elif top < bot:
            i += 1
        else:
            j += 1

        if abs(currMin[0] - currMin[1]) > abs(top - bot):
            currMin[0], currMin[1] = top,bot
        
    return currMin

