# optimization: delete duplicates
def solution(A):
    A.sort()
    for i in range(len(A) - 1):
        up_to = A[i] + A[i+1]
        for j in range(i+1, len(A)):
            up_to = A[i] + A[j]
            for k in range(j+1, len(A)):
                if A[k] >= up_to:
                    break
                if A[k] + A[i] > A[j] and A[j] + A[k] > A[i]:
                    return 1
    return 0

#test
A = [10, 2, 5, 1, 8, 20]
A1 = [10, 50, 5, 1]
print(solution(A1))
