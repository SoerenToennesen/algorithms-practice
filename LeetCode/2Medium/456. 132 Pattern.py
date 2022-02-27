
# Complexity O(n)
class Solution:
    def find132pattern(self, nums: list[int]) -> bool:
        dp = []
        for i in range(len(nums) - 2):
            first = nums[i]
            second = None
            for j in range(i, len(nums)):
                if second == None:
                    if nums[j] > first:
                        if first == 1: print(nums[j], first, 'what')
                        second = nums[j]
                else:
                    if first == 1: print(nums[j], second, 'up')
                    if nums[j] < second and nums[j] > first:
                        return True
            
        return False

#test
solution = Solution()
print(solution.find132pattern(nums = [1,2,3,4])) #False
print(solution.find132pattern(nums = [3,1,4,2])) #True
print(solution.find132pattern(nums = [-1,3,2,0])) #True
print(solution.find132pattern(nums = [1,0,1,-4,-3])) #False
print(solution.find132pattern(nums = [3,1,4,2])) #True
print(solution.find132pattern(nums = [-2,1,2,-2,1,2])) #True - why is this not False??
