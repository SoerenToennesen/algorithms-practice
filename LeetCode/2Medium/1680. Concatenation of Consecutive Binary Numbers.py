
class Solution:
    def concatenatedBinary(self, n: int) -> int:

        string_builder = ''
        for i in range(1, n + 1):
            string_builder += format(i, 'b')

        return int(string_builder, 2) % (10**9 + 7)

#test
solution = Solution()
print(solution.concatenatedBinary(1))
print(solution.concatenatedBinary(3))
print(solution.concatenatedBinary(12))
print(solution.concatenatedBinary(100))
print(solution.concatenatedBinary(1000))
print(solution.concatenatedBinary(10000))



