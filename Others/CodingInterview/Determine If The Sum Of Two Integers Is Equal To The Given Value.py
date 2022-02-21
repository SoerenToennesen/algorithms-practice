from gettext import find



#optimization thought:
# - delete all vals bigger than the value to check
# - sort the array
# - start from lowest val (index 0) and compare with highest val (index 0)
#    - if sum is larger, move highest val pointer one to the right, otherwise move lowest val pointer one to the left. Recurse until pointers meet.
def find_sum_of_two(arr, val):
    test_arr = []
    for n in arr:
        if n <= val:
            test_arr.append(arr)
    for i in range(len(test_arr)):
        for j in range(i, len(test_arr)):
            if arr[i] + arr[j] == val:
                return True
    return False

#test
print(find_sum_of_two([2,1,8,4,7,3], 3)) # True
print(find_sum_of_two([2,1,8,4,7,3], 7)) # True
print(find_sum_of_two([2,1,8,4,7,3], 20)) # False