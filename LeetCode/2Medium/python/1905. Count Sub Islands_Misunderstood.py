import numpy as np

# I misunderstood the assignment, but I will keep my code as I think my thought of the problem is cooler than the given (in the given, you are already given the islands and dont need to compute!!)
class Solution:
    def countSubIslands(self, grid1: list[list[int]], grid2: list[list[int]]) -> int:
        #thought process
        #find islands in grid 1, and mark them 1 if so, 0 if not
        #bitwise AND grid 1 and grid 2
        #all connecting 1s in grid 2 is a subisland
        n = len(grid1)
        m = len(grid1[0])
        grid1_islands = []
        explored = []
        for _ in range(len(grid1)):
            fill_zeroes = []
            for _ in range(len(grid1[0])):
                fill_zeroes.append(0)
            grid1_islands.append(fill_zeroes)
            explored.append(fill_zeroes.copy())
        
        for i in range(n):
            for j in range(m):
                if explored[i][j] == 1: continue
                if grid1[i][j] == 0: continue
                queue = [[i,j]]
                path = []
                start_width, start_height = i, j
                is_island = [False, False]
                while queue:
                    vertex = queue.pop(0)
                    if vertex[0] >= n or vertex[1] >= m: continue
                    if grid1[vertex[0]][vertex[1]] == 0: continue
                    if not is_island[0] and vertex[0] > start_width:
                        is_island[0] = True
                    if not is_island[1] and vertex[1] > start_height:
                        is_island[1] = True
                    if vertex not in path:
                        path.append(vertex)
                        queue.append([vertex[0] + 1, vertex[1]])
                        queue.append([vertex[0], vertex[1] + 1])
                for land in path:
                    explored[land[0]][land[1]] = 1
                if is_island[0] and is_island[1]:
                    for land in path:
                        grid1_islands[land[0]][land[1]] = 1

        subislands = np.logical_and(grid1_islands, grid2)
        count = 0
        for i in range(n):
            for j in range(m):
                explored[i][j] = False
        for i in range(n):
            for j in range(m):
                if explored[i][j]: continue
                if not subislands[i][j]: continue
                queue = [[i,j]]
                path = []
                while queue:
                    vertex = queue.pop(0)
                    if vertex[0] >= n or vertex[1] >= m: continue
                    if not subislands[vertex[0]][vertex[1]]: continue
                    if vertex not in path:
                        path.append(vertex)
                        queue.append([vertex[0] + 1, vertex[1]])
                        queue.append([vertex[0], vertex[1] + 1])
                for land in path:
                    explored[land[0]][land[1]] = True
                if path:
                    count += 1
        return count

#tests
solution = Solution()
print(solution.countSubIslands(
    grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], 
    grid2 = [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]
    ))
print(solution.countSubIslands(
    grid1 = [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], 
    grid2 = [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]
    ))
