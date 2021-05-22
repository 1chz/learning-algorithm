def possible(answer):
    for x, y, stuff in answer:
        # if column
        if stuff == 0:
            #possible if it stands on the bottom, or on an end of a beam
            if y == 0 or (x-1, y,1) in answer or (x, y, 1)in answer or (x, y-1, 0) in answer:
                continue
            return False
        # if beam
        elif stuff == 1:
            #possible if it sits on a column, or its both ends are connected to other beams
            if (x+1,y-1,0) in answer or (x,y-1,0) in answer or  ((x-1,y,1) in answer and (x+1, y, 1) in answer):
                continue
            return False
    return True

# solution
def solution(n,build_frames):
    answer = set() # set and tuples instead of arrays for faster removal of elements
    for frame in build_frames:
        x,y,stuff,action = frame
        # if removal
        if action == 0:
            answer.remove((x,y,stuff))
            if not possible(answer):
                answer.add((x,y,stuff))
        # if create
        else:
            answer.add((x, y, stuff))
            if not possible(answer):
                answer.remove((x, y, stuff))

    return sorted(answer)