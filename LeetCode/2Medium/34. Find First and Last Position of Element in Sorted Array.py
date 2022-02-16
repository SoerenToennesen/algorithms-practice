from bisect import bisect_left

class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        if len(nums) == 0: return [-1, -1]
        bin_search_index = bisect_left(nums, target)
        if bin_search_index >= len(nums): return [-1, -1]
        if nums[bin_search_index] != target: return [-1, -1]
        low_index = bin_search_index
        for i in range(bin_search_index - 1, -1, -1):
            if nums[i] == target:
                low_index = i
            else:
                break
        high_index = bin_search_index
        for i in range (bin_search_index + 1, len(nums)):
            if nums[i] == target:
                high_index = i
            else:
                break
        return [low_index, high_index]

#tests
solution = Solution()
print(solution.searchRange([5,7,7,8,8,10], 8))
print(solution.searchRange([], 0))
print(solution.searchRange([2,2], 3))
