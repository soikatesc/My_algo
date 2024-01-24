package binarysearch;

import java.util.*;

public class TimeBasedkeyValue {
    Map<String, List<AbstractMap.SimpleEntry<String, Integer>>> map;

    public TimeBasedkeyValue() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new AbstractMap.SimpleEntry<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        List<AbstractMap.SimpleEntry<String, Integer>> list = map.get(key);

        String closest = "";
        int closetDiff = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == timestamp) return list.get(i).getKey();

            if (list.get(i).getValue() < timestamp) {
                int currClosetDiff = timestamp - list.get(i).getValue();
                if (currClosetDiff < closetDiff) {
                    closest = list.get(i).getKey();
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        TimeBasedkeyValue timeMap = new TimeBasedkeyValue();
        timeMap.set("foo", "bar", 1);
        timeMap.get("foo", 1);
        timeMap.set("foo", "bar2", 4);
        timeMap.get("foo", 4);
        timeMap.get("foo", 5);
    }
}
