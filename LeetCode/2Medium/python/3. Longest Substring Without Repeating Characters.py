
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longest_substring = 0
        s_temp = s
        while len(s_temp) > 0:
            temp_count = 0
            seen_chars = []
            for c in s_temp:
                if c in seen_chars:
                    if temp_count > longest_substring:
                        longest_substring = temp_count
                    seen_chars = [c]
                    temp_count = 1
                else:
                    temp_count += 1
                    seen_chars.append(c)
            if temp_count > longest_substring:
                longest_substring = temp_count
            s_temp = s_temp[1:]
        return longest_substring

#tests
solution = Solution()
print(solution.lengthOfLongestSubstring("asjrgapa"))
