# not completely correct answer, but very close. 
class Solution:
    def getOrder(self, tasks: list[list[int]]) -> list[int]:
        
        #preprocessing
        todo = []
        max_time = max([task[0] for task in tasks])
        for i in range(max_time):
            todo.append([])
        for i in range(len(tasks)):
            tasks[i].append(i)
            if todo[max_time - tasks[i][0]]:
                for j in range(1, len(todo[max_time - tasks[i][0]]) + 1):
                    j -= 1
                    if todo[max_time - tasks[i][0]][j][1] <= tasks[i][1]:
                        break
                    j += 1
                todo[max_time - tasks[i][0]] = todo[max_time - tasks[i][0]][:j] + [tasks[i]] + todo[max_time - tasks[i][0]][j:]
            else:
                todo[max_time - tasks[i][0]].append(tasks[i])

        #computation
        available_tasks = []
        ret = []
        time = 1
        current_task = []
        while True:
            if not available_tasks and not todo:
                break
            next_task = []
            if todo:
                next_task = todo.pop()
            if next_task:
                for nt in range(len(next_task) - 1, -1, -1):
                    for i in range(1, len(available_tasks) + 1):
                        i -= 1
                        if available_tasks[i][1] <= next_task[nt][1]:
                            break
                        i += 1
                    available_tasks = available_tasks[:i] + [next_task[nt]] + available_tasks[i:]
                    #print(current_task, available_tasks)
            if current_task:
                if current_task[1] == 1:
                    current_task = []
                else:
                    current_task[1] -= 1
                    time += 1
                    continue
            if available_tasks:
                if available_tasks[-1][0] <= time:
                    #print(available_tasks)
                    current_task = available_tasks.pop()
                    ret.append(current_task[2])
            time += 1
        return ret

#tests
solution = Solution()
#print(solution.getOrder([[1,2],[2,4],[3,2],[4,1]]))
#print(solution.getOrder([[7,10],[7,12],[7,5],[7,4],[7,2]]))
print(solution.getOrder([[19,13],[16,9],[21,10],[32,25],[37,4],[49,24],[2,15],[38,41],[37,34],[33,6],[45,4],[18,18],[46,39],[12,24]]))