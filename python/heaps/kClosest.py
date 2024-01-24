from typing import List
import heapq

# T : O(n) + nlog(n)
def kClosest(points: List[List[int]], k: int) -> List[List[int]]:
    heap = [] #array[d, x, y]
    res = []

    for point in points:
        dist = (point[0] ** 2) + (point[1] ** 2)
        heap.append([dist, point[0], point[1]])
    
    # nlong(n)
    heapq.heapify(heap)

    # klog(n)
    while(k > 0):
        dist, x, y = heapq.heappop(heap)
        res.append([x, y]) 
        k -= 1

    return res

points = [[1,3],[-2,2]]
k = 1
print(points)
kClosest(points, k)