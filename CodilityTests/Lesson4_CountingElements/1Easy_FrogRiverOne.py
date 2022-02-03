
def solution(X, A):
    index_first_X = -1
    if X in A:
        index_first_X = A.index(X)
    else:
        return -1
    sublist_before = A[:index_first_X + 1]
    sublist_before.sort()
    sublist_after = A[index_first_X + 1:]
    missing_leaves = [i for i in range(sublist_before[0], sublist_before[-1]+1) if i not in sublist_before]
    if missing_leaves == []:
        return index_first_X
    for leaf in sublist_after:
        if leaf in missing_leaves:
            missing_leaves.remove(leaf)
        if missing_leaves == []:
            return A.index(leaf)
    return -1

#test
X1 = 5
A1 = [4,1,3,1,4,2,3,5,4]
X2 = 5
A2 = [3,2,4,1,5,5,4,5,4,5,6,7,2]
X3 = 7
A3 = [1,5,3,7,9,5,7,9,7,5,3,2,6,1,2,3,4,4,5,6]
print(solution(X3, A3))
