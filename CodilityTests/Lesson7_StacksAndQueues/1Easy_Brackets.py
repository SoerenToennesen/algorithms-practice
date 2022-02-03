

def isMatchingNest(c1, c2):
    if c1 == '(' and c2 == ')':
        return True
    if c1 == '[' and c2 == ']':
        return True
    if c1 == '{' and c2 == '}':
        return True
    return False

def solution(S):
    stack = []
    for s in S:
        if len(stack) != 0 and isMatchingNest(stack[-1], s):
            stack.pop()
            continue
        stack.append(s)
    if len(stack) == 0: return 1
    return 0


#test
S = "{[()()]}"
print(solution(S))
