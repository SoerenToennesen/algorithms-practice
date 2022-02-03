
def solution(N):
    count = 0
    for i in range(1, N // 2 + 1):
        if N % i == 0:
            count += 1
    return count + 1

#test
N = 24
print(solution(N))
