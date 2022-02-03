
def solution(A, B):
    count = 0
    for i in range(len(A)):
        N = A[i]
        M = B[i]

        prime_N = []
        for j in range(2, N + 1):
            if j == 0 or j == 1:
                continue
            else:
                for k in range(2, int(j/2)+1):
                    if i % j == 0:
                        break
                    else:
                        prime_N.append(j)

        prime_M = []
        for j in range(2, M + 1):
            if j == 0 or j == 1:
                continue
            else:
                for k in range(2, int(j/2)+1):
                    if i % j == 0:
                        break
                    else:
                        prime_M.append(j)
        
        prime_divisors_N = []
        for j in prime_N:
            if j % N == 0:
                prime_divisors_N.append(j)

        prime_divisors_M = []
        for j in prime_M:
            if j % M == 0:
                prime_divisors_M.append(j)

        prime_divisors_N.sort()
        prime_divisors_M.sort()

        if prime_divisors_N == prime_divisors_M:
            count += 1

    return count

#test
A = [15,10,3]
B = [75,30,5]
print(solution(A,B))
