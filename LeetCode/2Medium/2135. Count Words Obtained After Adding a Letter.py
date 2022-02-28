
class Solution:
    def representAsBits(self, string: str) -> str:
        mask=0
        for each_char in string:
            bit_position= ord(each_char)-97 #string consists of only lower-case letters
            mask= mask | (1<<bit_position)
        #return "0b%32d" % int(bin(mask)[2:])
        return '{:026b}'.format(mask)

    def wordCount(self, startWords: list[str], targetWords: list[str]) -> int:
        res = 0
        for target in targetWords:
            for start in startWords:
                if len(target) == len(start) + 1:
                    start_bin = self.representAsBits(start) #optimization would be to recompute this and store it instead of doing it for each target
                    target_bin = self.representAsBits(target)
                    if (0 ^ (int(start_bin, 2) ^ int(target_bin, 2))) > 0 and int(start_bin, 2) | (int(start_bin, 2) ^ int(target_bin, 2)) == int(target_bin, 2):
                        res += 1
                        break
        return res

#1110
#1111
#0001

#test
solution = Solution()
print(solution.wordCount(startWords = ["ant","act","tack"], targetWords = ["tack","act","acti"])) #2
print(solution.wordCount(startWords = ["ab","a"], targetWords = ["abc","abcd"])) #1
print(solution.wordCount(startWords = ["mox","bj","rsy","jqsh"], targetWords = ["trk","vjb","jkr"])) #1

#thought
#1110 -> this is our start word
#1111 -> this is our target word
#make sure that the length of the target word is one more than the length of the start word
#in order for it to be possible, xor the two, and make sure there is only 1 remaining bit
#if so, it is possible.
