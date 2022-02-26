
class Solution:
    def combinationSum4(self, nums: list[int], target: int) -> int:
        dp = [0] * (target + 1)
        dp[0] = 1
        for i in range(1, target + 1):
            for j in range(len(nums)):
                if nums[j] <= i:
                    dp[i] += dp[i - nums[j]]
        return dp[target]

#test
solution = Solution()
print(solution.combinationSum4(nums = [1,2,3], target = 4)) #7
print(solution.combinationSum4(nums = [9], target = 3)) #0
