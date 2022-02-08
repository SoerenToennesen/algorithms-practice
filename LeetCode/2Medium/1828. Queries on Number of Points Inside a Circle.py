import math

class Solution:
    def countPoints(self, points: list[list[int]], queries: list[list[int]]) -> list[int]:
        queries_store = {}
        for query in queries:
            queries_store[','.join(str(q) for q in query)] = 0
        for point in points:
            for query in queries:
                if math.sqrt( (point[0] - query[0])**2 + (point[1] - query[1])**2 ) <= query[2]:
                    queries_store[','.join(str(q) for q in query)] += 1
        res = []
        for query in queries_store:
            res.append(queries_store[query])
        return res

#tests
solution = Solution()
points = [[1,3],[3,3],[5,3],[2,2]]
queries = [[2,3,1],[4,3,1],[1,1,2]]
print(solution.countPoints(points, queries))
