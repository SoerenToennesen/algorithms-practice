
#dynamic programming problem
# solution found online: https://dev.to/shivams136/leetcode-322-coin-change-solution-4kmd
class Solution:
    def coinChange(self, coins: list[int], amount: int) -> int:
        if amount == 0: return 0
        
        dp = []
        for _ in range(amount + 1):
            dp.append(float('inf'))

        dp[0] = 0
        for i in range(1, amount + 1):
            for j in range(0, len(coins)):
                if coins[j] <= i:
                    rest = dp[i - coins[j]]
                    if rest != float('inf') and rest + 1 < dp[i]:
                        dp[i] = rest + 1

        return -1 if dp[amount] == float('inf') else dp[amount]

#test
solution = Solution()
print(solution.coinChange(coins = [1,2,5], amount = 11)) #3
print(solution.coinChange(coins = [2], amount = 3)) #-1
print(solution.coinChange(coins = [1], amount = 0)) #0
