
def solution(A):
    distinct_elements = set()
    for i in A:
        distinct_elements.add(abs(i))
    return len(distinct_elements)

#test
A = [-5,-3,-1,0,3,6]
print(solution(A))
