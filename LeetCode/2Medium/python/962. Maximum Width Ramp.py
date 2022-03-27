
class Solution:
    def maxWidthRamp(self, nums: list[int]) -> int:
        n = len(nums)
        res = 0

        for i in range(n - 1):
            for j in range(i+1, n):
                if nums[i] <= nums[j]:
                    if res < j - i:
                        res = j - i
        

        return res

#test
solution = Solution()
print(solution.maxWidthRampBrute([6,0,8,2,1,5]))
