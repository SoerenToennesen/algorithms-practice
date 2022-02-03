
def solution(S, P, Q):
    ret = []
    for i in range(len(P)):
        start_index = P[i] if P[i] <= Q[i] else Q[i]
        end_index = Q[i] if Q[i] >= P[i] else P[i]

        min_value = float('inf')
        substring = S[start_index : end_index+1] #is this +1?
        if 'A' in substring:
            ret.append(1)
            continue
        elif 'C' in substring:
            ret.append(2)
            continue
        elif 'G' in substring:
            ret.append(3)
            continue
        else:
            ret.append(4)
    return ret

#test
S  = "CAGCCTA"
P = [2, 5, 0]
Q = [4, 5, 6]
print(solution(S, P, Q))
