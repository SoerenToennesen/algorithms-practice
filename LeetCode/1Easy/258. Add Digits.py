import math

def solution(num):
    if int(math.log10(num))+1 == 1:
        return num
    sum_temp = 0
    for i in range(int(math.log10(num))+1):
        sum_temp += num // 10**i % 10
    return solution(sum_temp)

#tests
num = 38
print(solution(num))
