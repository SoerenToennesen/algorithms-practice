import math
#solution too slow, but you can check up online for dynamic programming or even better, binary search
class Solution:
    def isPrime(self, n: int) -> bool:
        prime_flag = 0
        if(n > 1):
            for i in range(2, int(math.sqrt(n)) + 1):
                if (n % i == 0):
                    prime_flag = 1
                    break
            if (prime_flag == 0):
                return True
            else:
                return False
        else:
            return False
    def nthUglyNumber(self, n: int) -> int:
        if n == 1: return 1
        if n == 2: return 2
        if n == 3: return 3
        if n == 4: return 4
        if n == 5: return 5
        if n == 6: return 6
        count = 6
        i = 7
        while count < n:
            i += 1
            add = True
            for j in range(7, i//2+1):
                if self.isPrime(j):
                    if i % j == 0:
                        add = False
                        break
            if add and not self.isPrime(i):
                count += 1
        return i

#tests
solution = Solution()
print(solution.nthUglyNumber(124))
