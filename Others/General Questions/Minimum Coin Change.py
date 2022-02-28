
class Solution:
    def minimumCoinChange(arr: list[int], target: int) -> int:
        arr.sort()
        arr = set(arr)
        print(arr[0])
        return -1

#test
solution = Solution()
print(solution.minimumCoinChange(arr = [1,5,6,9], target = 10))
print(solution.minimumCoinChange(arr = [4,10,24], target = 41))
