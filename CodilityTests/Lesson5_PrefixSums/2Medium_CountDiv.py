
def solution_trivial(A, B, K):
    count = 0
    if A > K:
        for i in range(A, B):
            if i % K == 0:
                count += 1
    else:
        for i in range(K, B):
            if i % K == 0:
                count += 1
    
    return count

def solution(A, B, K):
    a = A//K
    b = B//K
    if A % K == 0:
        return b - a + 1
    else:
        return b - a

#test
A1 = 0
B1 = 2000000
K1 = 2
A2 = 6
B2 = 11
K2 = 2
print(solution(A2, B2, K2))
