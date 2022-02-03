
def solution(A):
    max_slice_sum = 0
    slice_sum = 0
    for i in range(len(A)):
        slice_sum += A[i]
        if slice_sum < 0:
            slice_sum = 0
        else:
            if slice_sum > max_slice_sum:
                max_slice_sum = slice_sum
    return max_slice_sum if max_slice_sum > 0 else max(A)

#test
A = [3,2,-6,4,0]
print(solution(A))
