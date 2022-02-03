
def solution(A):
    A = sorted(A, key=abs)
    min_abs_pair = float('inf')
    for i in range(len(A)-1):
        check1 = abs(A[i]*2)
        check2 = abs(A[i]+A[i+1])
        check3 = abs(A[i+1]+A[i+1])
        check = min(check1, check2, check3)
        if check < min_abs_pair:
            min_abs_pair = check
    return min_abs_pair

#test
A1 = [1, 4, -3]
A2 = [-8,4,5,-10,3]
print(solution(A2))
