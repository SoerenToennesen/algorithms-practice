
def leader(A):
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
    for i in range(len(A)):
        if A[i] == possible_dominator1:
            count1 += 1
        elif A[i] == possible_dominator2:
            count2 += 1
    if count1 > dominator_criteria:
        return possible_dominator1
    if count2 > dominator_criteria:
        return possible_dominator2
    return -1

def solution(A):
    equileaders = 0
    for i in range(len(A)):
        first_split = A[:i+1]
        second_split = A[i+1:]
        leader1 = leader(first_split)
        if leader1 == -1:
            continue
        leader2 = leader(second_split)
        if leader1 == leader2:
            equileaders += 1
    return equileaders

#test
A = [4,3,4,4,4,2]
print(solution(A))
