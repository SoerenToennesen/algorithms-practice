
class Solution:
    def maxTurbulenceSize(self, arr: list[int]) -> int:
        n = len(arr)
        dp = []
        for i in range(n):
            dp.append(0)
        for i in range(1, n - 1):
            if arr[i] < arr[i-1] and arr[i] < arr[i+1]:
                dp[i] = dp[i - 1] + 1
            elif arr[i] > arr[i-1] and arr[i] > arr[i+1]:
                dp[i] = dp[i - 1] + 1
            elif arr[i]==arr[i+1] and arr[i]==arr[i-1]:
                dp[i] = 0
            else:
                dp[i] = 1
        return max(dp) + 1

#test
solution = Solution()
print(solution.maxTurbulenceSize([9,4,2,10,7,8,8,1,9])) #5 - fix
print(solution.maxTurbulenceSize([4,8,12,16])) #2 - fix
print(solution.maxTurbulenceSize([100])) #1
print(solution.maxTurbulenceSize([100, 100, 101, 101, 102, 101])) #3
print(solution.maxTurbulenceSize([0,1,1,0,1,0,1,1,0,0])) #5
print(solution.maxTurbulenceSize([3,2,4,4])) #3
print(solution.maxTurbulenceSize([3,2])) #2
print(solution.maxTurbulenceSize([3,3])) #1
print(solution.maxTurbulenceSize([3,2,3,2])) #4
print(solution.maxTurbulenceSize([2,0,2,4,2,5,0,1,2,3])) #6
print(solution.maxTurbulenceSize([0,0,1,0,1,0,1,1])) #6
