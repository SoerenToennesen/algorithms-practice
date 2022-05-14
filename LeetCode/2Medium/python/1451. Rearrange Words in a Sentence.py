

class Solution:
    def arrangeWords(self, text: str) -> str:
        words = text.split()
        words[0] = words[0].lower()
        words = sorted(words, key = len)
        words[0] = words[0].capitalize()
        return " ".join(words)
solution = Solution()
print(solution.arrangeWords("Leetcode is cool"))