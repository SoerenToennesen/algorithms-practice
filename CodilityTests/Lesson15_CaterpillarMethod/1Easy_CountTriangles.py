
def solution(A):
    count = 0
    possible_combinations = set()
    for i in range(len(A)):
        for j in range(i+1, len(A)):
            for k in range(j+1, len(A)):
                if A[i] + A[j] > A[k] and A[j] + A[k] > A[i] and A[k] + A[i] > A[j]:
                    count += 1
    return count

#test
A = [10,2,5,1,8,12]
print(solution(A))
