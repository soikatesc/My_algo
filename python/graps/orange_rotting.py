from typing import List
from queue import Queue

directions = [
    [-1, 0],
    [0, 1],
    [1, 0],
    [0, -1]
]

# T: O(N * M)
# S: O(N)
def orangesRotting(grid: List[List[int]]) -> int:
    rows = len(grid)
    cols = len(grid[0])

    ROTTEN = 2
    FRESH = 1
    EMPTY = 0

    if rows == 0 or cols == 0:
        return -1
    
    queue = Queue()
    freshOranges = 0

    for row in range(rows):
        for col in range(cols):
            if grid[row][col] == ROTTEN:
                queue.put([row, col])
            if grid[row][col] == FRESH:
                freshOranges += 1
    
    currQueueSize = queue.qsize()
    minutes = 0

    while not queue.empty():
        if currQueueSize == 0:
            minutes += 1
            currQueueSize = queue.qsize()

        currOrange = queue.get()
        currQueueSize -= 1

        currRow = currOrange[0]
        currCol = currOrange[1]

        for dir in directions:
            newRow = currRow + dir[0]
            newCol = currCol + dir[1]

            if (newRow < 0 or 
                newCol < 0 or 
                newRow >= len(grid) or 
                newCol >= len(grid[0]) or 
                grid[newRow][newCol] == 0 or
                grid[newRow][newCol] == 2):
                continue
            grid[newRow][newCol] = 2
            freshOranges -= 1
            queue.put([newRow, newCol])
    return minutes if freshOranges == 0 else -1
                    
grid = [[2,1,1],[1,1,0],[0,1,1]]
print(orangesRotting(grid))