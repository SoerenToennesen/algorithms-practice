
# thought
# - get a bit for each num in nums
# - loop from 0 to n where n = max bit size (this will mean the bit index corresponding to nums index will be + or -, with all combinations)
class Solution:
    def findTargetSumWays(self, nums: list[int], target: int) -> int:
        n = len(nums)
        bits = 2**n
        res = 0
        for i in range(bits):
            bit_sequence = bin(i)[2:].zfill(n)
            nums_temp = nums.copy()
            for j in range(len(bit_sequence)):
                nums_temp[j] *= 1 if bit_sequence[j] == '0' else -1
            if sum(nums_temp) == target:
                res += 1
        return res

#test
solution = Solution()
print(solution.findTargetSumWays(nums = [1,1,1,1,1], target = 3)) #5
print(solution.findTargetSumWays(nums = [1], target = 1)) #1
print(solution.findTargetSumWays(nums = [10,9,6,4,19,0,41,30,27,15,14,39,33,7,34,17,24,46,2,46], target = 45)) #6606
