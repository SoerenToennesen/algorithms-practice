
# thought:
# - use sliding window technique, start with highest number, go to lowest number
class Solution:
    def isAllOnes(self, matrix: list[list[int]]) -> bool:
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    return False
        return True
    def countSquares(self, matrix: list[list[int]]) -> int:
        square_side = min(len(matrix), len(matrix[0]))
        res = 0
        while square_side > 0:
            for i in range(len(matrix) - square_side + 1):
                for j in range(len(matrix[0]) - square_side + 1):
                    matrix_temp = []
                    for k in range(i, i + square_side):
                        matrix_temp.append([])
                        for l in range(j, j + square_side):
                            matrix_temp[k-i].append(matrix[k][l])
                    #print(matrix_temp)
                    if self.isAllOnes(matrix_temp): #construct matrix
                        res += 1
            square_side -= 1
        return res

#test
solution = Solution()
print(solution.countSquares(matrix = [[0,1,1,1],
                                      [1,1,1,1],
                                      [0,1,1,1]]
                            ))
print(solution.countSquares(matrix = [[1,0,1],[1,1,0],[1,1,0]]))
