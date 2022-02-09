
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longest_substring = 0
        temp_count = 0
        seen_chars = []
        for c in s:
            if c in seen_chars:
                if temp_count > longest_substring:
                    longest_substring = temp_count
                seen_chars = [c]
                temp_count = 1
            else:
                temp_count += 1
                seen_chars.append(c)
        return longest_substring if longest_substring >= temp_count else temp_count

#tests
solution = Solution()
print(solution.lengthOfLongestSubstring("abcabcbb"))
