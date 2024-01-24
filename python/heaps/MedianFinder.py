import heapq

class MedianFinder:

    def __init__(self):
        self.small_heap = [] # max heap
        self.large_heap = [] # min heap

    def addNum(self, num: int) -> None:
        heapq.heappush(self.small_heap, -1 * num)
        
        if self.large_heap and (-1 * self.small_heap[0]) > self.large_heap[0]:
            heapq.heappush(self.large_heap, -1 * heapq.heappop(self.small_heap))
        if len(self.large_heap) - len(self.small_heap) > 1:
            heapq.heappush(self.small_heap, -1 * heapq.heappop(self.large_heap))
        if len(self.small_heap) - len(self.large_heap) > 1:
            heapq.heappush(self.large_heap, -1 * heapq.heappop(self.small_heap))
        
    def findMedian(self) -> float:
        if len(self.small_heap) < len(self.large_heap):
            return self.large_heap[0]
        if len(self.small_heap) > len(self.large_heap):
            return -1 * self.small_heap[0]
        return (((-1 * self.small_heap[0]) + self.large_heap[0]) / 2)
obj = MedianFinder()
obj.addNum(1)
obj.addNum(2)
print(obj.findMedian())
obj.addNum(3)
print(obj.findMedian())