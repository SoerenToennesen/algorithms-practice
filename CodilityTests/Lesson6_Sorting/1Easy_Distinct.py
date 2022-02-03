
def solution(A):
    if len(A) == 0: return 0
    A.sort()
    count = 1
    have_seen = A[0]
    for a in A:
        if a != have_seen:
            have_seen = a
            count += 1
    return count

#test
A = [2, 1, 1, 2, 3, 1]
print(solution(A))
