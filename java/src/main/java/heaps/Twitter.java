package heaps;

import java.util.PriorityQueue;
import java.util.*;

public class Twitter {

    private int count = 0;
    private HashMap<Integer, HashSet<Integer>> followMap;
    private HashMap<Integer, List<int[]>> tweetMap; // userId -> List of [count, tweetIds]

    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!tweetMap.containsKey(userId)) {
            tweetMap.put(userId, new ArrayList<>());
        }
        this.tweetMap.get(userId).add(new int[] {count, tweetId});
        count ++;
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        java.util.PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        followMap.computeIfAbsent(userId, k -> new HashSet<>());

        followMap.get(userId).add(userId);

        for (int followeeId : followMap.get(userId)) {
            if (tweetMap.containsKey(followeeId)) {
                int i = tweetMap.get(followeeId).size() - 1;
                int[] tweet = tweetMap.get(followeeId).get(i);
                maxHeap.offer(new int[]{tweet[0], tweet[1], followeeId, --i});
            }
        }

        while (!maxHeap.isEmpty() && result.size() < 10) {
            int[] data = maxHeap.poll();
            result.add(data[1]);

            if (data[3] >= 0) {
                int[] tweet = tweetMap.get(data[2]).get(data[3]);
                maxHeap.offer(new int[]{tweet[0], tweet[1], data[2], --data[3]});
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (!followMap.containsKey(followerId)) {
            followMap.put(followerId, new HashSet<>());
        }

        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)&& followMap.get(followerId).contains(followeeId))
            followMap.get(followerId).remove(followeeId);
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        twitter.getNewsFeed(1);

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        twitter.getNewsFeed(1);
        twitter.unfollow(1, 2);
        twitter.getNewsFeed(1);
    }
}
