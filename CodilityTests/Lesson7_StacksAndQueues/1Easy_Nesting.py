
def solution(S):
    missing_nest = 0
    for s in S:
        if s == '(':
            missing_nest += 1
        else:
            missing_nest -= 1
        if missing_nest < 0:
            return 0
    return 1 if missing_nest == 0 else 0

#test
S = "(()(())())"
print(solution(S))
