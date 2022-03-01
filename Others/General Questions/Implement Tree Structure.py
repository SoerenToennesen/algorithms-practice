class Tree:
    def __init__(self):
        self.left = None
        self.right = None
        self.data = None

root = Tree()
root.data = "root"
root.left = Tree()
root.left.data = "left"
root.right = Tree()
root.right.data = "right"

# arbitrary number of children
class Tree2:
    def __init__(self, data):
        self.children = []
        self.data = data

left = Tree("left")
middle = Tree("middle")
right = Tree("right")
root = Tree("root")
root.children = [left, middle, right]

#otherwise use a dictionary, where each value points to the connected nodes
#directed means A -> B has A: [B] but not B: [A]
#undirected means A - B has A: [B] and B: [A]
