
def solution(lines):
    answer = 0
    count = 0

    # pre-processing
    startTimes = []
    endTimes = []

    for x in lines:
        a, time, duration = x.split()
        hh, mm, ss = time.split(":")

        endTime = (int(hh)*60*60 + int(mm)*60 + float(ss))*1000
        startTime = endTime - float(duration[:-1])*1000 + 1

        endTimes.append(endTime)
        startTimes.append(startTime)

    endTimes.sort()
    startTimes.sort()

    n = len(lines)
    i,j = 0,0
    while i < n:
        count = 0
        if startTimes[i] <= endTimes[j]:
            curTime = startTimes[i]
            i += 1
        else:
            curTime = endTimes[j]
            j += 1

        for t in startTimes:
            if t <= curTime + 1*1000 - 1:
                count += 1

        for t in endTimes:
            if t < curTime:
                count -= 1

        answer = max(answer, count)

    return answer