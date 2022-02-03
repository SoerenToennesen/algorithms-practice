
def solution(A):
    biggest_difference = 0
    lowest_seen = float('inf')
    for i in range(len(A)):
        if A[i] - lowest_seen > biggest_difference:
            biggest_difference = A[i] - lowest_seen
        if A[i] < lowest_seen:
            lowest_seen = A[i]
    return biggest_difference if biggest_difference > 0 else 0

#test
A = [23171, 21011, 21123, 21366, 21013, 21367]
print(solution(A))
