
class Solution:
    def maxOperations(self, nums: list[int], k: int) -> int:
        nums.sort()
        res = 0
        lo = 0
        hi = len(nums) - 1
        while lo < hi:
            if nums[lo] + nums[hi] == k:
                nums.pop(lo)
                nums.pop(hi - 1)
                hi -= 2
                res += 1
            elif nums[lo] + nums[hi] < k:
                lo += 1
            else:
                hi -= 1

        return res

#test
solution = Solution()
print(solution.maxOperations(nums = [1,2,3,4], k = 5))
print(solution.maxOperations(nums = [3,1,3,4,3], k = 6))
