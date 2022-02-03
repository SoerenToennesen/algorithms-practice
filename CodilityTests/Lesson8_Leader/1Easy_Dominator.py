
def solution(A):
    counter_element_index = [0,0,0]
    counter_element_index2 = [0,0,0]
    for i in range(len(A)):
        if counter_element_index[0] == 0 or counter_element_index[1] == A[i]:
            counter_element_index[0] += 1
            counter_element_index[1] = A[i]
            counter_element_index[2] = i
        elif counter_element_index2 == 0 or counter_element_index2[1] == A[i]:
            counter_element_index2[0] += 1
            counter_element_index2[1] = A[i]
            counter_element_index2[2] = i
        else:
            counter_element_index[0] -= 1
            counter_element_index2[0] -= 1

    dominator_criteria = len(A) // 2
    possible_dominator1 = counter_element_index[1]
    possible_dominator2 = counter_element_index2[1]
    count1 = 0
    count2 = 0
    index1 = -1
    index2 = -1
    for i in range(len(A)):
        if A[i] == possible_dominator1:
            count1 += 1
            index1 = i
        elif A[i] == possible_dominator2:
            count2 += 1
            index2 = i
    res = -1
    if count1 > dominator_criteria:
        res = index1
    if count2 > dominator_criteria:
        res = index2
    return res

#test
A = [3,4,3,2,3,-1,3,3]
A1 = [3,3,4,4,5]
print(solution(A))
#3,3,4,4,5