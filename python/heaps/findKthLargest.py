from typing import List
import heapq

def findKthLargest(nums: List[int], k: int) -> int:
    maxHeap = []

    for num in nums:
        maxHeap.append(-num)
    
    heapq.heapify(maxHeap)
    
    num = 0
    while(k > 0):
        num = heapq.heappop(maxHeap)
        k -= 1

    return -num
    
    



nums = [-1,-1]
k = 2
findKthLargest(nums, k)
