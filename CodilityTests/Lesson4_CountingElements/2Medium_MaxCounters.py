
#Not very efficient... instead keep track of the max counter all the time,
#  and dont update all values every time we encounter this operation.
#  When we do have to increment a counter, take this update into consideration
def solution(N, A):
    counters = [0] * N
    for i in range(len(A)):
        if A[i] > N:
            counters = [max(counters) for x in counters]
        else:
            counters[A[i] - 1] += 1
    return counters

#test
N = 5
A = [3,4,4,6,1,4,4]
print(solution(N, A))
