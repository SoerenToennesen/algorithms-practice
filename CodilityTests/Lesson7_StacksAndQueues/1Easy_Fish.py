
from turtle import down


def solution2(A, B):
    fish_alive = 0
    fish_going_upstream = []
    for i in range(len(A)):
        if B[i] == 1:
            fish_going_upstream.append(A[i])
        else:
            fish_going_upstream_temp = fish_going_upstream[:]
            survived_fish = False
            for j in fish_going_upstream_temp[::-1]:
                if j > A[i]:
                    survived_fish = True
                    break
                else:
                    fish_going_upstream.pop()
            fish_alive += 1 if survived_fish else 0
    return fish_alive + len(fish_going_upstream)

def solution(A, B):
    N = len(A)
    downstream_stack = []
    swam_away_count = 0
    for i in range(N):
        if B[i] == 0:
            if len(downstream_stack) != 0:
                eaten = False
                while len(downstream_stack) != 0:
                    if downstream_stack[-1] < A[i]:
                        downstream_stack.pop()
                    else:
                        eaten = True
                        break
                if not eaten:
                    swam_away_count += 1
            else:
                swam_away_count += 1
        else:
            downstream_stack.append(A[i])
    return swam_away_count + len(downstream_stack)



#test
A = [4,3,2,1,5]
B = [0,1,0,0,0]
print(solution(A,B))