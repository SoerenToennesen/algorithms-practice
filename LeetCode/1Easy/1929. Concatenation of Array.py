
def solution(nums):
    res = []
    for i in range(2):
        for i in range(len(nums)):
            res.append(nums[i])
    return res

#tests
nums = [1,2,1]
print(solution(nums))
