package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private int[] nums = new int[]{2, 7, 11, 15};

    private int target = 9;

    @Before
    public void before() {
    }

    @Test
    public void testSolution1() {
        // 初始化一个空的集合。
        RandomizedSet1 randomSet = new RandomizedSet1();

        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomSet.insert(1);

        // 返回 false ，表示集合中不存在 2 。
        randomSet.remove(2);

        // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomSet.insert(2);

        // getRandom 应随机返回 1 或 2 。
        randomSet.getRandom();

        // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomSet.remove(1);

        // 2 已在集合中，所以返回 false 。
        randomSet.insert(2);

        // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        randomSet.getRandom();
    }

    @Test
    public void testSolution2() {
        // 初始化一个空的集合。
        RandomizedSet2 randomSet = new RandomizedSet2();

        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomSet.insert(1);

        // 返回 false ，表示集合中不存在 2 。
        randomSet.remove(2);

        // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomSet.insert(2);

        // getRandom 应随机返回 1 或 2 。
        randomSet.getRandom();

        // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomSet.remove(1);

        // 2 已在集合中，所以返回 false 。
        randomSet.insert(2);

        // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        randomSet.getRandom();
    }

    @Test
    public void testSolution3() {
        // 初始化一个空的集合。
        RandomizedSet3 randomSet = new RandomizedSet3();

        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomSet.insert(1);

        // 返回 false ，表示集合中不存在 2 。
        randomSet.remove(2);

        // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomSet.insert(2);

        // getRandom 应随机返回 1 或 2 。
        randomSet.getRandom();

        // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomSet.remove(1);

        // 2 已在集合中，所以返回 false 。
        randomSet.insert(2);

        // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        randomSet.getRandom();
    }
}
