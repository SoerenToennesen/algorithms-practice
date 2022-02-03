
def solution(A, K):
    if 0 <= len(A) <= 1:
        return A
    temp_A = A[:]
    temp = temp_A[0]
    for i in range(len(temp_A)):
        A[(i+K) % len(A)] = temp
        if i+1 >= len(temp_A):
            break
        temp = temp_A[i+1]
    return A

# test
A1 = [3, 8, 9, 7, 6]
K1 = 3
A2 = [0, 0, 0]
K2 = 1
A3 = [1, 2, 3, 4]
K3 = 4
A4 = [0]
K4 = 5
A5 = []
K5 = 6
print(solution(A1, K1))