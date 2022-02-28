import sys
class Solution:
    def minimumCoinChange(self, arr: list[int], target: int) -> int:
        #make sure input is correct for our algorithm

        #dynamic programming algorithm
        dp = [0 for i in range(target + 1)]
        dp[0] = 0
        for i in range(1, target + 1):
            dp[i] = sys.maxsize
        for i in range(1, target + 1):
            for j in range(len(arr)):
                if arr[j] <= i:
                    temp = dp[i - arr[j]]
                    if temp != sys.maxsize and temp + 1 < dp[i]:
                        dp[i] = temp + 1
        if dp[target] == sys.maxsize: return -1
        return dp[target]

#test
solution = Solution()
print(solution.minimumCoinChange(arr = [1,5,6,9], target = 10))
print(solution.minimumCoinChange(arr = [4,10,24], target = 41))
