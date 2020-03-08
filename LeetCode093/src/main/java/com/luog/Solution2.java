package com.luog;

import java.util.ArrayList;
import java.util.List;

/**
 * 暴力求解, 循环表示每一位在原字符中的起始位置
 */
public class Solution2 {
    public List<String> restoreIpAddresses(String s) {
        List<String> resultList = new ArrayList<>();

        if (s == null || s.length() < 4 || s.length() > 12) {
            return resultList;
        }

        int length = s.length();
        for (int i = 1; i <= 3; i++) {
            if (length - i > 9 || length - i <= 0) {
                continue;
            }
            String num0 = s.substring(0, i);
            if (!check(num0)) {
                continue;
            }
            for (int j = i + 1; j <= i + 3; j++) {
                if (length - j > 6 || length - j <= 0) {
                    continue;
                }
                String num1 = s.substring(i, j);
                if (!check(num1)) {
                    continue;
                }

                for (int k = j + 1; k <= j + 3; k++) {
                    if (length - k > 3 || length - k <= 0) {
                        continue;
                    }
                    String num2 = s.substring(j, k);
                    if (!check(num2)) {
                        continue;
                    }

                    for (int l = k; l <= k + 3; l++) {
                        if (length - l != 0) {
                            continue;
                        }
                        String num3 = s.substring(k, l);
                        if (!check(num3)) {
                            continue;
                        }

                        resultList.add(num0 + "." + num1 + "." + num2 + "." + num3);
                    }
                }
            }
        }

        return resultList;
    }

    private boolean check(String s) {
        boolean bool = s.length() > 1 && s.startsWith("0");
        int num = Integer.parseInt(s);
        return !bool && num < 256;
    }
}
