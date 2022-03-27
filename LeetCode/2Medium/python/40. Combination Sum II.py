
# Got solution from: https://www.goodtecher.com/leetcode-40-combination-sum-ii/
class Solution:
    def helper(self, results, candidates, target, combination, start):
        if target == 0:
            results.append(list(combination))
            return
        if target < 0:
            return
        for i in range(start, len(candidates)):
            if i != start and candidates[i] == candidates[i - 1]:
                continue
            combination.append(candidates[i])
            self.helper(results, candidates, target - candidates[i], combination, i + 1)
            combination.pop()
    
    def combinationSum2(self, candidates: list[int], target: int) -> list[list[int]]:
        results = []
        candidates.sort()
        self.helper(results, candidates, target, [], 0)
        return results
        
#test
solution = Solution()
print(solution.combinationSum2(candidates = [10,1,2,7,6,1,5], target = 8))
print(solution.combinationSum2(candidates = [2,5,2,1,2], target = 5))
