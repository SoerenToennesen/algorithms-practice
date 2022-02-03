#solution found on stackoverflow...
def solution(A):
    dp = [0] * 6
    dp[-1] = A[0]

    for i in range(1, len(A)):
        maxVal = -166680001

        for k in range(1, 7):
            if i-k >= 0:
                maxVal = max(maxVal, dp[-k] + A[i])

        dp.append(maxVal)
        dp.pop(0)
    return dp[-1]

def solution_bad(A):
    dp = [1] * 6

    for i in range(1, len(A)):

        subproblems = [dp[j] for j in range(i) if i-j >= 0]
        dp[i] = 1 + max(subproblems, default=0)
    print(dp)
    return max(dp, default=0)

#test
A = [1,-2,0,9,-1,-2]
#A = [1,2,3,4,5,6,7,8,9,10,11]
print(solution(A))
