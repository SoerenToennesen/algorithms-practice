
def solution(A):
    ret = []
    for i in range(len(A)):
        count = 0
        for j in range(len(A)):
            if i == j:
                continue
            if A[i] % A[j] != 0:
                count += 1
        ret.append(count)
    return ret

#test
A = [3,1,2,3,6]
print(solution(A))
