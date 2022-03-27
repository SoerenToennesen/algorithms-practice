
class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        table = ['0']
        for i in range(1, n):
            table.append('')
            curr_length = 0
            for j in range(len(table[i-1])):
                if table[i-1][j] == '0':
                    table[i] += '01'
                else:
                    table[i] += '10'
                curr_length += 2
                if curr_length >= k:
                    return table[i][k-1]
        return table[-1][k-1]

#test
solution = Solution()
print(solution.kthGrammar(n = 1, k = 1)) #0
print(solution.kthGrammar(n = 2, k = 1)) #0
print(solution.kthGrammar(n = 2, k = 2)) #1
#print(solution.kthGrammar(n = 3, k = 3)) #?
#print(solution.kthGrammar(n = 10, k = 3)) #1
print(solution.kthGrammar(n = 30, k = 434991989)) #?
