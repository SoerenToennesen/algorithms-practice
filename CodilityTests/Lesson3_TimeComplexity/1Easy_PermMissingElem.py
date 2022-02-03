
def solution(A):
    A.sort()
    N = len(A)
    if N == 0: return 1
    for i in range(N):
        if i+1 != A[i]:
            return i+1
    return N + 1

#test
A = [2,3,1,5]
print(solution(A))