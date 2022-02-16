
#time limit exceed error. To make this more performant, I could first of all not pop 0, but pop the end by reversing the data structure, and I could also make the island variable a set rather than a list (and not have to check if element is in it or not)
class Solution:
    def countSubIslands(self, grid1: list[list[int]], grid2: list[list[int]]) -> int:
        n = len(grid1)
        m = len(grid1[0])
        check_islands = []
        for i in range(n):
            for j in range(m):
                if grid2[i][j] == 2 or grid2[i][j] == 0: continue
                queue = [[i,j]]
                island = []
                while queue:
                    vertex = queue.pop(0)
                    if vertex[0] >= n or vertex[0] < 0 or vertex[1] >= m or vertex[1] < 0: continue
                    if grid2[vertex[0]][vertex[1]] == 0: continue
                    if vertex not in island:
                        island.append(vertex)
                        queue.append([vertex[0] + 1, vertex[1]])
                        queue.append([vertex[0] - 1, vertex[1]])
                        queue.append([vertex[0], vertex[1] + 1])
                        queue.append([vertex[0], vertex[1] - 1])
                check_islands.append(island)
                for land in island:
                    grid2[land[0]][land[1]] = 2
        
        count = 0
        for island in check_islands:
            add = True
            for land in island:
                if grid1[land[0]][land[1]] == 0:
                    add = False
                    break
            if add:
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
print(solution.countSubIslands(
    grid1=[[0,1,1,1,1,1,1,0,1,1],[1,0,1,1,1,0,1,1,1,1],[1,0,1,1,0,1,1,1,1,1],[1,0,1,1,0,1,1,1,1,1],[1,0,1,1,1,1,1,0,1,1],[1,1,0,0,1,1,1,0,0,1],[1,1,0,1,1,0,0,1,1,0],[0,1,1,1,1,1,1,1,1,1],[1,0,0,1,1,0,1,1,1,1]],
    grid2=[[0,0,1,1,1,1,1,1,1,1],[1,0,0,1,1,1,0,0,1,0],[1,1,1,0,1,1,0,1,1,1],[1,0,0,1,0,0,1,0,1,1],[0,1,1,1,0,1,0,1,1,0],[1,1,1,0,0,0,1,0,1,0],[1,1,1,1,1,1,1,1,1,1],[1,1,1,0,0,0,1,0,1,1],[1,1,1,1,1,1,0,1,1,0]]
    ))