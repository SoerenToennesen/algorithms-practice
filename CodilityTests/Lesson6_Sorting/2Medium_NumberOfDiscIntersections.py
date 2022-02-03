from bisect import bisect_right
def solution(A):
    pairs = 0
    intervals = sorted( [(i-A[i], i+A[i]) for i in range(len(A))] )
    starts = [i[0] for i in intervals]
    for i in range(len(starts)):
        disk_end = intervals[i][1]
        count = bisect_right(starts, disk_end)
        count -= (i+1) #dont double-count
        pairs += count
        if pairs > 10000000:
            return -1
    return pairs

#test
A = [1, 5, 2, 1, 4, 0] #reverse-sort: [5,4,2,1,1,0]
print(solution(A))
