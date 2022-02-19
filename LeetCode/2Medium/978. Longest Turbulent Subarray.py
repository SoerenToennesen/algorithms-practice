
class Solution:
    def maxTurbulenceSize(self, arr: list[int]) -> int:
        if len(arr) == 1: return 1
        max_size = 0
        temp_size = 0
        start = False
        direction = False #False mean we are increasing, true otherwise
        for i in range(len(arr) - 1):

            #print(arr[i], arr[i+1])

            if arr[i] == arr[i+1]:
                #print('test1', temp_size)
                if temp_size >= max_size:
                    max_size = temp_size + 1
                temp_size = 1
                start = False
                continue

            if not start or (arr[i] < arr[i+1] and not direction):
                #print('test2', temp_size)
                start = True
                direction = True if arr[i] < arr[i+1] else False
                temp_size += 1
                continue

            if not start or (arr[i] > arr[i+1] and direction):
                #print('test3', temp_size)
                start = True
                direction = False if arr[i] > arr[i+1] else True
                temp_size += 1
                continue

            #print('test4', temp_size)

            if temp_size >= max_size:
                max_size = temp_size

            temp_size = 1
            start = False
            
        

        if temp_size > max_size:
            print('what')
            max_size = temp_size

        return max_size

#test
solution = Solution()
#print(solution.maxTurbulenceSize([9,4,2,10,7,8,8,1,9]))
#print(solution.maxTurbulenceSize([4,8,12,16]))
#print(solution.maxTurbulenceSize([100]))
#print(solution.maxTurbulenceSize([100, 100, 101, 101, 102, 101]))
print(solution.maxTurbulenceSize([0,1,1,0,1,0,1,1,0,0]))
print(solution.maxTurbulenceSize([9,4,2,10,7,8,8,1,9]))
print(solution.maxTurbulenceSize([3,2,4,4]))
