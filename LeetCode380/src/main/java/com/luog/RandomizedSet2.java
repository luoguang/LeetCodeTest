package com.luog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomizedSet2 {
    private HashMap<Integer, Integer> indexMap;

    private List<Integer> dataList;

    private int length;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet2() {
        indexMap = new HashMap<>();
        dataList = new ArrayList<>();
        length = 0;
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }

        indexMap.put(val, length);
        dataList.add(val);
        length++;
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        length--;
        int index = indexMap.get(val);
        int last = dataList.get(length);
        dataList.set(index, last);
        indexMap.put(last, index);

        dataList.remove(length);
        indexMap.remove(val);

        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int index = (int) (Math.random() * length);
        return dataList.get(index);
    }
}