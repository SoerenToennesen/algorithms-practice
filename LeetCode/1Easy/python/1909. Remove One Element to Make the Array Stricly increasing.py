
def solution(nums):
    res = True
    removed = False
    for i in range(1, len(nums)):
        if nums[i-1] >= nums[i]:
            if not removed:
                removed = True
            else:
                return False
    return res

#tests
nums = [1,2,10,5,7]
print(solution(nums))
