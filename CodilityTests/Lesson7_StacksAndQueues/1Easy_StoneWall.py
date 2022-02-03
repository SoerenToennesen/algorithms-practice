
def solution(H):
    count = 0
    walls_to_be_determined = []
    walls_to_be_determined.append(H[0])
    if len(H) == 1:
        return 1
    for i in range(1, len(H)):
        if H[i] < walls_to_be_determined[-1]:
            count += 1
            walls_to_be_determined.pop()
            walls_to_be_determined.append(H[i])
        elif H[i] > walls_to_be_determined[-1]:
            count += 1
            walls_to_be_determined.append(H[i])
    return count

#test
H = [8,8,5,7,9,8,7,4,8]
print(solution(H))
