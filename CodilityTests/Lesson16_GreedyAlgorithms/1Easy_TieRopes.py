
def solution(K, A):
    N = len(A)
    count = 0
    i = 0
    while i < N:
        tied_ropes = 0
        while (tied_ropes < K):
            if i >= N:
                return count
            tied_ropes += A[i]
            i += 1
        count += 1
    return count

#test
K = 4
A = [1,2,3,4,1,1,3]
print(solution(K,A))
