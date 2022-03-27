

class Solution(object):
    def minPartitions(self, n):
        maxNum = 0
        for char in n:
            if int(char) > maxNum:
                maxNum = int(char)
        return maxNum
        
solution = Solution()
print(solution.minPartitions("27346209830709182346"))

