from typing import List
from queue import Queue

directions = [
    [-1, 0], # up
    [0, 1], # right
    [1, 0], # down
    [0, -1] # left
]

# T: O(m * n) 
# Max size of queue can be S: O(max(M, N))
def numIslands(grid: List[List[str]]) -> int:
    count = 0

    if len(grid) == 0:
        return 0

    rows = len(grid)
    cols = len(grid[0])

    for row in range(rows):
        for col in range(cols):  # O (n * m)
            if grid[row][col] == '1':
                count += 1
                grid[row][col] = 0
                
                queue = Queue()
                queue.put([row, col])

                while not queue.empty(): # O(n)
                    currPos = queue.get()
                    currRow = currPos[0]
                    currCol = currPos[1]
                    for dir in directions:
                        newRow = currRow + dir[0]
                        newCol = currCol + dir[1]

                        if (newRow < 0 or 
                            newCol < 0 or 
                            newRow >= len(grid) or 
                            newCol >= len(grid[0]) or 
                            grid[newRow][newCol] == "0"):
                            continue
                        grid[newRow][newCol] = "0"
                        queue.put([newRow, newCol])
    return count


grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
numIslands(grid)