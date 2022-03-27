import math
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        first_num = 0
        second_num = 0
        i = 0
        for j,k in zip(reversed(l1), reversed(l2)):
            first_num += j*10**(i)
            second_num += k*10**(i)
            i+=1
        sum = first_num + second_num
        res = []
        for i in range(int(math.log10(sum))+1, 0, -1):
            res.append(sum // 10**(i-1) % 10)
        return res

solution = Solution()
print(solution.addTwoNumbers([2,4,3], [5,6,4]))
