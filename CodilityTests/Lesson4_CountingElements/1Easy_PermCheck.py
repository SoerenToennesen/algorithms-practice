
def solution(A):
    A.sort()
    for i in range(len(A)):
        if i+1 == A[i]:
            continue
        else:
            return 0
    return 1

#test
A = [4,3,1,2,6]
print(solution(A))
