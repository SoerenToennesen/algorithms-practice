
class Solution:
    def numberOfRounds(self, loginTime: str, logoutTime: str) -> int:
        login_nums = [int(loginTime[0:2]), int(loginTime[3:5])]
        login_nums_original = login_nums.copy()
        if login_nums[1] > 45:
            login_nums[1] = 0
            login_nums[0] += 1
        elif login_nums[1] > 30:
            login_nums[1] = 45
        elif login_nums[1] > 15:
            login_nums[1] = 30
        elif login_nums[1] > 0:
            login_nums[1] = 15
        logout_nums = (int(logoutTime[0:2]), int(logoutTime[3:5]))
        minute_difference = (logout_nums[1] - login_nums[1]) // 15
        hour_difference_temp = (logout_nums[0] - login_nums[0])
        if hour_difference_temp < 0 or (hour_difference_temp == 0 and logout_nums[1] - login_nums_original[1] < 0):
            hour_difference = 24 - login_nums[0] + logout_nums[0]
        else:
            hour_difference = hour_difference_temp
        return hour_difference*4 + minute_difference

#I got stuck in specific cases, because I increment login_nums[0] by 1, and this shouldnt happen in ex. "00:47", "00:57", as it will think we played for over 23 hrs (when in fact we didnt play at all)
#Solution found online here: https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/discuss/1550908/python-3-solution
import math
def numberOfRounds(startTime: str, finishTime: str) -> int:
	startTime = int(startTime[:2])*60+int(startTime[3:])
	finishTime = int(finishTime[:2])*60+int(finishTime[3:])

	start, finish = math.ceil(startTime/15)*15, math.floor(finishTime/15)*15

	if finishTime>=startTime:
		played = (finish-start)//15
		return max(0, played)
	return (1440-start+finish)//15

solution = Solution()
print(solution.numberOfRounds("00:47", "00:57"))
print(numberOfRounds("00:47", "00:57"))
