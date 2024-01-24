from queue import Queue

directions = [
    [-1, 0], # up
    [0, 1], # right
    [1, 0], # down
    [0, -1] # left
]

# T : O(n)
# S : O(n)
def traverseBfs(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    res = []

    seen = [[False] * cols for i in range(rows)]
    queue = Queue()
    queue.put([0, 0])

    while not queue.empty():
        cord = queue.get()

        row = cord[0]
        col = cord[1]
        if row < 0 or col < 0 or row >= len(matrix) or col >= len(matrix[0]) or seen[row][col]:
            continue

        seen[row][col] = True
        res.append(matrix[row][col])

        for dir in directions:
            newx = row + dir[0]
            newy = col + dir[1]
            queue.put([newx, newy])
    print(res)

matrix = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20]
]

traverseBfs(matrix)