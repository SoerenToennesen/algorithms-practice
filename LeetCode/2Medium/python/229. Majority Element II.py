
class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        n = len(nums)
        res = []
        if n < 3:
            for num in nums:
                if num not in res:
                    res.append(num)

        threshold = n / 3

        unique_elements = {}
        for num in nums:
            if not num in unique_elements:
                unique_elements[num] = 1
            else:
                unique_elements[num] += 1
                if unique_elements[num] > threshold and not num in res:
                    res.append(num)

        return res

#test
solution = Solution()
print(solution.majorityElement([3,2,3]))
print(solution.majorityElement([1]))
print(solution.majorityElement([1,2]))
