# Thought out solution:
# Mark the full range the planks lie on, from minimum to maximum - make an array of 0s with this.
# Then for each planks, increment the index value of where it lies on the created array.
# The highest values in the array have most overlaps and should be prioritized.
# If there exists nails that cover any of these hot spots, we should also remove the planks afterwards, until we are left with no planks. 

def solution(A, B, C):
    max_list = max(B)
    min_list = min(A)
    planks_list = [[0]*1 for i in range(max_list - min_list + 1)]
    for i in range(len(A)):
        for j in range(A[i]-min_list, B[i]-min_list+1):
            planks_list[j][0] += 1
            planks_list[j].append(i)
    used_nails = 0
    while (sum(row[0] for row in planks_list) > 0):
        largest_overlap = 0
        for i in range(len(planks_list)):
            if planks_list[i][0] > largest_overlap:
                largest_overlap = i
        to_decrement = [x for x in planks_list[largest_overlap][1:]]
        already_decremented = set()
        for x in to_decrement:
            for i in range(A[x]-min_list, B[x]-min_list+1):
                if (planks_list[i][0] != 0 and i not in already_decremented):
                    planks_list[i][0] -= 1
                already_decremented.add(i)
        used_nails += 1
    return used_nails

#test
A = [1,4,5,8]
B = [4,5,9,10]
C = [4,6,7,10,2]
print(solution(A,B,C))


# [(1, [0]), (1, 1, 2, 2, 1, 1, 2, 2, 1]
