from typing import List
from collections import defaultdict
import heapq
# {
#     1: {}
# }
# {
#     1: [[tweetId, count], [tweetId, count]]
# }
class Twitter:

    def __init__(self):
        self.count = 0
        self.followMap = defaultdict(set)
        self.tweetMap = defaultdict(list)

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.tweetMap[userId].append([self.count, tweetId])
        self.count -= 1

    def getNewsFeed(self, userId: int) -> List[int]:
        res = [] #List of 10 most recent tweet Ids

        heap = []

        for followeeId in self.followMap[userId]:
            if self.tweetMap[followeeId]:
                index = len(self.tweetMap[followeeId]) - 1
                count, tweetId = self.tweetMap[followeeId][index]
                heap.append([count, tweetId, followeeId, index - 1])
        heapq.heapify(heap)
        
        while heap and len(res) <= 10:
            count, tweetId, followeeId, index = heapq.heappop(heap)
            res.append(tweetId)

            if index >= 0:
                count, tweetId = self.tweetMap[followeeId][index]
                heapq.heappush(heap, [count, tweetId, followeeId, index - 1])
    
        return res
        
    def follow(self, followerId: int, followeeId: int) -> None:
        self.followMap[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if (self.followMap[followerId] and 
            followeeId in self.followMap[followerId]):
            self.followMap[followerId].remove(followeeId)

obj = Twitter() #inst
obj.follow(1, 5)
obj.getNewsFeed(1)
obj.follow(1, 2)
obj.postTweet(2, 6)
obj.postTweet(2, 7)
obj.postTweet(5, 8)
print(obj.getNewsFeed(1))
