
class Solution:
    def wonderfulSubstrings(self, word: str) -> int:
        all_substrings = [word[i: j] for i in range(len(word)) for j in range(i + 1, len(word) + 1)]
        res = 0
        for substring in all_substrings:
            freq_dict = {}
            odd_count = 0
            for c in substring:
                if c not in freq_dict:
                    freq_dict[c] = 1
                else:
                    freq_dict[c] += 1
                if freq_dict[c] % 2 == 1:
                    odd_count += 1
                else:
                    odd_count -= 1
            if odd_count < 2: res += 1
        return res

#test
solution = Solution()
print(solution.wonderfulSubstrings("aba")) #4
print(solution.wonderfulSubstrings("aabb")) #9
