package com.luog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomizedSet1 {
    private HashMap<Integer, Object> obj;

    private int length;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet1() {
        obj = new HashMap<>();
        length = 0;
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (obj.containsKey(val)) {
            return false;
        }

        obj.put(val, null);
        length++;
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!obj.containsKey(val)) {
            return false;
        }

        obj.remove(val);
        length--;
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int index = (int) (Math.random() * length);
        List<Integer> keyList = new ArrayList<>(obj.keySet());
        return keyList.get(index);
    }
}