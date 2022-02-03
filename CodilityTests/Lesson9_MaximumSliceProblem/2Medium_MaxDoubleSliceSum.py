
def solution(A):
    n = len(A)
    K1 = [0] * n
    K2 = [0] * n
    for i in range(1,n-1,1):
        K1[i] = max(K1[i-1] + A[i], 0)

    for i in range(n-2,0,-1):
        K2[i] = max(K2[i+1]+A[i], 0)

    maximum = 0
    for i in range(1,n-1,1):
        maximum = max(maximum, K1[i-1]+K2[i+1])

    return maximum

#test
A = [3,2,6,-1,4,5,-1,2]
print(solution(A))
