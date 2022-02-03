
def solution(A, B):
    B_check = 0
    A_check = 1
    N = len(A)
    if N == 0:
        return 0
    max_segment_size = 1
    for i in range(N-1):
        if B[B_check] < A[A_check]:
            max_segment_size += 1
            B_check = A_check
            A_check += 1
        else:
            A_check += 1
    return max_segment_size

#test
A = [1,3,7,9,9]
B = [5,6,8,9,10]
print(solution(A,B))
