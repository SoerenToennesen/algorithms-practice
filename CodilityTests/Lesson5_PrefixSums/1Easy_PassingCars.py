
def solution(A):
    passing_cars = 0
    current_cars_going_west = sum(A) #works because 0 doesn't affect this
    for a in A:
        if passing_cars > 1000000000:
            return -1
        if a == 0:
            passing_cars += current_cars_going_west
        else:
            current_cars_going_west -= 1
    return passing_cars

#test
import random
size_of_list = 100
A1 = [0]*size_of_list + [1]*size_of_list
random.shuffle(A1)
A2 = [0,1,0,1,1]
print(solution(A2))
