
class Solution:
    def longestPalindrome(self, s: str) -> str:
        if s == "":
            return ""
        longest_sequence = ""
        current_sequence = ""
        for c in s:
            current_sequence += c
            built_string1 = ""
            built_string2 = ""
            for c_temp1 in current_sequence:
                built_string1 += c_temp1
            for c_temp2 in reversed(current_sequence):
                built_string2 += c_temp2
            if built_string1 == built_string2 and len(current_sequence) > len(longest_sequence):
                longest_sequence = current_sequence
        check_recursive = self.longestPalindrome(s[1:])
        if len(check_recursive) > len(longest_sequence):
            longest_sequence = check_recursive
        return longest_sequence

#tests
solution = Solution()
print(solution.longestPalindrome("babaabcdefuufedcbabad"))
