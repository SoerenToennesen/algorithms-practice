
class Solution:
    def wonderfulSubstrings(self, word: str) -> int:
        all_substrings = [word[i: j] for i in range(len(word)) for j in range(i + 1, len(word) + 1)]
        res = 0
        for substring in all_substrings:
            freq_dict = {}
            for c in substring:
                if c not in freq_dict:
                    freq_dict[c] = 1
                else:
                    freq_dict[c] += 1
            count = 0
            for key in freq_dict:
                if freq_dict[key] % 2 == 1:
                    count += 1
                if count > 1:
                    break
            if not count > 1:
                res += 1
        return res

#test
solution = Solution()
print(solution.wonderfulSubstrings("aba")) #4
print(solution.wonderfulSubstrings("aabb")) #9
