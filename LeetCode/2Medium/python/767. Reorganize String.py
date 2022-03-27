
class Solution:
    def reorganizeString(self, s: str) -> str:
        letters = {}

        for c in s:
            if not c in letters:
                letters[c] = 1
            else:
                letters[c] += 1

        res = ''
        while len(letters) > 0:
            if not res:
                res += max(letters, key=letters.get)

            else:
                to_check = sorted(letters, key=letters.get, reverse=True)
                char_toadd = to_check[:1][-1]
                if res[-1] == char_toadd:
                    i = 2
                    next_char = to_check[:i][-1]
                    while next_char == char_toadd:
                        i += 1
                        next_char_temp = to_check[:i][-1]
                        if next_char_temp == next_char:
                            return ''
                        else:
                            next_char = next_char_temp
                    res += next_char
                else:
                    res += char_toadd
                
            letters[res[-1]] -= 1
            if letters[res[-1]] == 0:
                del letters[res[-1]]
        return res

#test
solution = Solution()
print(solution.reorganizeString(s = "aab")) #"aba"
print(solution.reorganizeString(s = "aaab")) #""
