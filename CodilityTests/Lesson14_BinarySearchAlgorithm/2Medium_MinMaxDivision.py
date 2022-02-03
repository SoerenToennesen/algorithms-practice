
def split(a, n):
    k, m = divmod(len(a), n)
    return (a[i*k+min(i, m):(i+1)*k+min(i+1, m)] for i in range(n))

def solution(K, M, A):
    attempts = set()
    B = list(split(A, K))
    to_add = []
    for b in B:
        to_add.append(len(b))
    attempts.add(tuple(to_add))
    sums = []
    max_sum = 0
    for i in range(len(B)):
        sum_temp = sum(B[i])
        if sum_temp > max_sum:
            max_sum = sum_temp
        sums.append(sum_temp)
    i = 0
    modified = True
    j = 0
    while (modified):
        modified = False
        for i in range(len(B) - 1):
            j += 1
            if sum(B[i]) > sum(B[i+1]):
                difference = sum(B[i]) - sum(B[i+1])
                min_difference = float('inf')
                changed = False
                while (abs(difference) <= min_difference):
                    min_difference = abs(difference)
                    B[i+1].insert(0,B[i][-1])
                    del B[i][-1]
                    to_add = []
                    for b in B:
                        to_add.append(len(b))
                    if tuple(to_add) in attempts:
                        B[i].append(B[i+1][0])
                        del B[i+1][0]
                        break
                    attempts.add(tuple(to_add))
                    changed = True
                    modified = True
                    difference = sum(B[i]) - sum(B[i+1])
                if changed:
                    B[i].append(B[i+1][0])
                    del B[i+1][0]

            elif sum(B[i]) < sum(B[i+1]):
                difference = sums[i+1] - sums[i]
                min_difference = float('inf')
                changed = False
                while (abs(difference) <= min_difference):
                    min_difference = abs(difference)
                    B[i].append(B[i+1][0])
                    del B[i+1][0]
                    to_add = []
                    for b in B:
                        to_add.append(len(b))
                    if tuple(to_add) in attempts:
                        B[i+1].insert(0, B[i][-1])
                        del B[i][-1]
                        break
                    attempts.add(tuple(to_add))
                    changed = True
                    modified = True
                    difference = sum(B[i+1]) - sum(B[i])
                if changed:
                    B[i+1].insert(0, B[i][-1])
                    del B[i][-1]
    i = 0
    max_sum2 = 0
    for i in range(len(B)):
        if sum(B[i]) > max_sum2:
            max_sum2 = sum(B[i])
    #print(B)
    return max_sum2

#test
K = 3
M = 5
A = [2,1,5,1,2,2,2]
A = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,15]
print(solution(K,M,A))
