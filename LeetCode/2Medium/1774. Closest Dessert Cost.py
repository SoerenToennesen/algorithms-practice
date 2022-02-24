
# Thought:
# - Naive: Go through all possible combinations
# - Stop earlier if target found
# Found solution online: https://www.tutorialspoint.com/program-to-find-closest-dessert-cost-in-python
class Solution:
    def closestCost(self, baseCosts: list[int], toppingCosts: list[int], target: int) -> int:
        res = baseCosts[0]
        num_toppings = len(toppingCosts)
        for i in range(len(baseCosts)):
            bitmask = [0 for i in range(num_toppings)]
            while True:
                price = baseCosts[i]
                for j in range(num_toppings):
                    price += toppingCosts[j] * bitmask[j]
                if price == target:
                    return target
                if abs(price - target) < abs(res - target):
                    res = price
                elif abs(price - target) == abs(res - target):
                    if price < res:
                        res = price
                if 0 not in bitmask and 1 not in bitmask:
                    break
                for j in range(num_toppings):
                    if bitmask[j] != 2:
                        bitmask[j] += 1
                        break
                    else:
                        bitmask[j] = 0
        return res

#test
solution = Solution()
print(solution.closestCost(baseCosts = [1,7], toppingCosts = [3,4], target = 10)) #10
print(solution.closestCost(baseCosts = [2,3], toppingCosts = [4,5,100], target = 18)) #17
print(solution.closestCost(baseCosts = [3,10], toppingCosts = [2,5], target = 9)) #8
