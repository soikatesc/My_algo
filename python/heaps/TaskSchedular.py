from typing import List
from collections import Counter
import heapq
from collections import deque

def leastInterval(tasks: List[str], n: int) -> int:
    counts = Counter(tasks)

    maxHeap = [ -count for count in counts.values()]
    heapq.heapify(maxHeap)

    queue = deque()
    time = 0

    while maxHeap or queue:
        time += 1
        if maxHeap:
            val = heapq.heappop(maxHeap) + 1
            if val:
                next = time + n
                queue.append([val, next])
        if queue and queue[0][1] == time:
            heapq.heappush(maxHeap, queue.popleft()[0])
    return time
            

tasks = ["A","A","A","B","B","B"]
n = 2

leastInterval(tasks, n)