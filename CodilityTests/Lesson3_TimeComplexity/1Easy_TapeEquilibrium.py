
def solution(A):
    min_split = float('inf')
    first_split = 0
    second_split = sum(A)
    if len(A) == 2:
        return abs(A[0] - A[1])
    for i in A:
        first_split += i
        second_split -= i
        temp_split = abs(first_split - second_split)
        if temp_split < min_split:
            min_split = temp_split
    return min_split

#test
A = [3,1,2,4,3]
A = [0,4000]
print(solution(A))