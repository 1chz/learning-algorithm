"""
Move Element to End

06/17/2021

"""
def moveElementToEnd(array, toMove):
    # O(n) T,O(1)S
    ptr, ptr2 = 0, len(array) - 1
    while ptr < ptr2:
        while ptr < ptr2 and array[ptr2]==toMove:
            ptr2 -= 1
        if array[ptr] == toMove:
            array[ptr], array[ptr2] = array[ptr2],array[ptr]
            ptr2 -= 1
        ptr += 1

    return array 