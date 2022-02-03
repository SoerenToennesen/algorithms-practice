
def solution(N):
    minimal_perimeter = 2 * (1 * N)
    for i in range(1, N+1):
        if N % i == 0:
            if N//i < i:
                break
            perimeter = 2 * (N//i + i)
            if perimeter < minimal_perimeter:
                minimal_perimeter = perimeter
    return minimal_perimeter

#test
N = 30
print(solution(N))
