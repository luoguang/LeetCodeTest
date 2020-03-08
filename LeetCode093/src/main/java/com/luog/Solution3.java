package com.luog;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归/回溯算法，参考题解
 */
public class Solution3 {
    public List<String> restoreIpAddresses(String s) {
        List<String> resultList = new ArrayList<>();

        if (s == null || s.length() < 4 || s.length() > 12) {
            return resultList;
        }

        int length = s.length();
        List<String> list = new ArrayList<>();
        doRestore(s, length, 0, resultList, list);

        return resultList;
    }

    private void doRestore(String s, int len, int start, List<String> resultList, List<String> list) {
        if (list.size() == 4) {
            if (start == len) {
                resultList.add(String.join(".", list));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > len) {
                break;
            }

            String str = s.substring(start, start + i);
            if (check(str)) {
                break;
            }
            list.add(str);
            doRestore(s, len, start + i, resultList, list);
            // 删除本轮递归add的值
            list.remove(list.size() - 1);
        }
    }

    /**
     * check方法的逻辑改了，不符合的数字返回true
     *
     * @param s
     * @return
     */
    private boolean check(String s) {
        boolean bool = s.length() > 1 && s.startsWith("0");
        int num = Integer.parseInt(s);
        return bool || num >= 256;
    }
}
