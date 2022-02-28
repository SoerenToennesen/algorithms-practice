
from numpy import maximum_sctype


class Solution:
    def maximumSubArray(self, arr: list[int]) -> int:
        if len(arr) == 0: return 0
        if len(arr) == 1: return arr[0]
        max_at_index = [arr[0]]
        for i in range(1, len(arr)):
            if arr[i] > arr[i] + max_at_index[i-1]:
                max_at_index.append(arr[i])
            else:
                max_at_index.append(arr[i] + max_at_index[i-1])
        return max(max_at_index)

#test
solution = Solution()
print(solution.maximumSubArray(arr = [1,-3,2,1,-1])) #3
print(solution.maximumSubArray(arr = [-2,1,-3,4,-1,2,1,-5,4])) #6
