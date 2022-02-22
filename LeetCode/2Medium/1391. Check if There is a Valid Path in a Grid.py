
class Solution:
    def hasValidPath(self, grid: list[list[int]]) -> bool:
        if len(grid) == 1 and len(grid[0]) == 1:
            return True
        directions = [[0,-1], [1,0], [0,1], [-1,0]] #down, right, up, left
        directions_tiles = {
            1: [[],[1,3,5],[],[1,4,6]], #right, left
            2: [[2,5,6],[],[2,3,4],[]], #down, up,
            3: [[2,5,6],[],[],[1,4,6]], #down, left
            4: [[2,5,6],[1,3,5],[],[]], #down, right
            5: [[],[],[2,3,4],[1,4,6]], #up, left
            6: [[],[1,3,5],[2,3,4],[]]  #right, up
        }
        n = len(grid)
        m = len(grid[0])
        grid_visited = []
        for i in range(n):
            grid_visited.append([])
            for j in range(m):
                grid_visited[i].append([grid[i][j], False])
        
        current = [0,0]
        res = False
        while True:
            grid_visited[current[0]][current[1]][1] = True
            tile_type = grid_visited[current[0]][current[1]][0]
            should_continue = False
            for direct in directions:
                test_tile = [current[0] + direct[0], current[1] + direct[1]]
                if not (test_tile[0] >= 0 and test_tile[0] < n and test_tile[1] >= 0 and test_tile[1] < m):
                    continue
                tile_test_type = grid_visited[test_tile[0]][test_tile[1]][0]
                if (not grid_visited[test_tile[0]][test_tile[1]][1]) and tile_test_type in directions_tiles[tile_type][directions.index(direct)]:
                    if test_tile[0] == n - 1 and test_tile[1] == m - 1:
                        res = True
                        break
                    current = test_tile
                    should_continue = True
                    break
            if should_continue: continue
            break

        return res

#test
solution = Solution()
print(solution.hasValidPath(grid = [[2,4,3],[6,5,2]]))
print(solution.hasValidPath(grid = [[1,2,1],[1,2,1]]))
print(solution.hasValidPath(grid = [[1,1,2]]))
print(solution.hasValidPath(grid = [[1,1,1,1,1,1,3]])) #this doesnt work, because it checks incorrectly in the direction_tiles, I think

