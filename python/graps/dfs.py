directions = [
    [-1, 0], # up
    [0, 1], # right
    [1, 0], # down
    [0, -1] # left
]

def traverseDfs(matrix):
    rows = len(matrix)
    cols = len(matrix[0])

    seen = [[False] * cols for i in range(rows)]
    
    values = []
    dfs(matrix, 0, 0, seen, values)
    print(values)

def dfs(matrix, row, col, seen, values):
    # base case
    if (row < 0 or col < 0 or row >= len(matrix) or col >= len(matrix[0]) or seen[row][col]):
        return

    values.append(matrix[row][col])
    seen[row][col] = True

    for dir in directions:
        dfs(matrix, row + dir[0], col + dir[1], seen, values)

matrix = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20]
]

traverseDfs(matrix)