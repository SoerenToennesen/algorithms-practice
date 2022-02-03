

def solution(N):
    bin_representation = format(N, "b")
    max_count = 0
    count = 0
    for b in bin_representation:
        if b == '0':
            count+=1
        else:
            if count > max_count:
                max_count = count
            count = 0
    return max_count

#test
N1 = 10 #1
N2 = 1041 #5
N3 = 32
print(solution(N3))
