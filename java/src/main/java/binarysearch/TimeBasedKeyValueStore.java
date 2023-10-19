package binarysearch;

import java.util.*;

public class TimeBasedKeyValueStore {
    Map<String, List<AbstractMap.SimpleEntry<String, Integer>>> store;
    public TimeBasedKeyValueStore() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!store.containsKey(key)) {
            store.put(key, new ArrayList<>());
        }

        store.get(key).add(new AbstractMap.SimpleEntry<>(value, timestamp));
    }

    // linear O(n)
    public String getLiner(String key, int timestamp) {
        List<AbstractMap.SimpleEntry<String, Integer>> list = store.get(key);

        String output = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == timestamp) return list.get(i).getKey();

            if (list.get(i).getValue() < timestamp) {
                output = list.get(i).getKey();
            } else {
                break;
            }
        }
        return output;
    }

    // binarySearch
    public String get(String key, int timestamp) {
        List<AbstractMap.SimpleEntry<String, Integer>> list = store.get(key);

        String output = "";

        int l = 0;
        int r = list.size() - 1;

        while (l <= r)  {
            int m = (l + r) / 2;

            if (list.get(m).getValue() == timestamp) return  list.get(m).getKey();

            if (list.get(m).getValue() < timestamp) {
                output = list.get(m).getKey();
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        TimeBasedKeyValueStore obj = new TimeBasedKeyValueStore();
        obj.set("foo", "bar", 1);
        obj.get("foo", 1);
        obj.set("foo", "bar2", 4);
        obj.set("foo", "bar2", 5);
        obj.get("foo", 4);
        obj.get("foo", 5);
        obj.get("foo", 2);
    }
}



