package com.luog;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    public String simplifyPath(String path) {
        if (path == null || path.equals("")) {
            return "";
        }

        Deque<String> deque = new ArrayDeque<>();
        String[] paths = path.split("/");
        for (String s : paths) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }

            if (s.equals("..")) {
                if (deque.size() > 0) {
                    deque.pollLast();
                }
                continue;
            }

            deque.offerLast(s);
        }

        StringBuilder buffer = new StringBuilder();
        for (String s : deque) {
            buffer.append("/").append(s);
        }

        return deque.size() == 0 ? "/" : buffer.toString();
    }
}
