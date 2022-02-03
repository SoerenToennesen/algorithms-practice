
def solution(M, A):
    distinct_slices = 0
    k = len(A)
    i = 0
    while (i < k):
        curr_slice = []
        add = True
        for j in range(i, k):
            if A[j] in curr_slice:
                duplicate_in_curr_slice = curr_slice.index(j)
                take_away = j - duplicate_in_curr_slice
                distinct_slices += (j+j*(j-1)/2) - (take_away+take_away*(take_away-1)/2)
                i = j - 1
                add = False
                break
            else:
                curr_slice.append(A[j])
        if add:
            distinct_slices += (k+k*(k-1)/2) - (i+i*(i-1)/2)
            break
        i += 1
    return int(distinct_slices)

#test
M = 6
A = [3,4,5,5,2]
print(solution(M,A))


# [3, 4, 5, 2, 6, 5, 1, 7, 3]