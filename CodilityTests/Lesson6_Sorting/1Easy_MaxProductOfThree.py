
def solution(A):
    A.sort()
    len_A = len(A)
    return max([A[0] * A[1] * A[len_A - 1], A[len_A - 1] * A[len_A - 2] * A[len_A - 3]])

#test
A = [-3, 1, 2, -2, -5, -5, 5, 6]
A = [-3,5,0,5]
print(solution(A))
