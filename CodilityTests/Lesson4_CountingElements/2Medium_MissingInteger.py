from bisect import bisect_left

def solution(A):
    A.sort()
    min_value = 1
    index_min_value = bisect_left(A, min_value)
    if index_min_value != len(A) and A[index_min_value] == min_value:
        to_search = A[index_min_value:]
    else:
        return min_value

    for a in to_search:
        if a < min_value:
            continue
        elif a == min_value:
            min_value+=1
        else:
            return min_value
    return min_value

#test
A1 = [-3,-2,-4,1, 3, 6, 4, -5,-1,0, 1, 2]
A2 = [-1, -3]
print(solution(A1))
