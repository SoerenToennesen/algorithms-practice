
class Solution:
    def computeArea(self, ax1: int, ay1: int, ax2: int, ay2: int, bx1: int, by1: int, bx2: int, by2: int) -> int:
        
        area1 = abs(ax2 - ax1) * abs(ay2 - ay1)
        area2 = abs(bx2 - bx1) * abs(by2 - by1)

        if ax2 < bx1 or bx2 < ax1:
            return area1 + area2
        start_x = max(ax1, bx1) 
        end_x = min(ax2, bx2)
        overlapping_x = max(0, end_x - start_x)

        start_y = max(ay1, by1) 
        end_y = min(ay2, by2)
        overlapping_y = max(0, end_y - start_y)

        return area1 + area2 - overlapping_x * overlapping_y

#test
solution = Solution()
print(solution.computeArea(ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2))
print(solution.computeArea(ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2))
