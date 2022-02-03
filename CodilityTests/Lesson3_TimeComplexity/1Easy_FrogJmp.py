
def solution(X, Y, D):
    distance = Y - X
    return (distance + ( -distance % D)) // D

#test
X = 1
Y = 5
D = 10
print(solution(X, Y, D))
