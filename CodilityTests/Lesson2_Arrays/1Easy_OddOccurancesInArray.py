
def solution(A):
    not_paired = set()
    for a in A:
        if a in not_paired:
            not_paired.remove(a)
        else:
            not_paired.add(a)
    return not_paired.pop()

#test
A = [9,3,9,3,9,7,9]
print(solution(A))