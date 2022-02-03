import math
def solution(N, M):
    return N // math.gcd(N, M)
    '''chocolates = [1] * N
    chocolates[0] = 0
    current = 0
    count = 1
    while True:
        current = (current + M) % N
        if chocolates[current] == 0:
            break
        else:
            chocolates[current] = 0
            count += 1
    return count'''

#test
N = 10
M = 4
print(solution(N,M))
