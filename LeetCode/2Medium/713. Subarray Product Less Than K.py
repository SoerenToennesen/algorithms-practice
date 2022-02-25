
class Solution:
    def numSubarrayProductLessThanK(self, nums: list[int], k: int) -> int:
        if k < 1: return 0
        for i in range(len(nums)):
            current_product = nums[i]
            if current_product < k:
                res += 1
            else:
                continue
            for j in range(i+1, len(nums)):
                current_product *= nums[j]
                if current_product < k:
                    res += 1
                else:
                    break

        return res

#test
solution = Solution()
print(solution.numSubarrayProductLessThanK(nums = [10,5,2,6], k = 100)) #8
print(solution.numSubarrayProductLessThanK(nums = [1,2,3], k = 0)) #0
