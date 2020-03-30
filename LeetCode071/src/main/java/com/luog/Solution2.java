package com.luog;

import java.util.Stack;

public class Solution2 {
    public String simplifyPath(String path) {
        if (path == null || path.equals("")) {
            return "";
        }

        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for (String s : paths) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }

            if (s.equals("..")) {
                if (stack.size() > 0) {
                    stack.pop();
                }
                continue;
            }

            stack.push(s);
        }

        StringBuilder buffer = new StringBuilder();
        for (String s : stack) {
            buffer.append("/").append(s);
        }

        return stack.size() == 0 ? "/" : buffer.toString();
    }
}
