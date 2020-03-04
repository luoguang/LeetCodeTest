package com.luog;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        List<StringBuffer> resultList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            StringBuffer buffer = new StringBuffer();
            resultList.add(buffer);
        }

        int row = 0;
        int flag = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            resultList.get(row).append(String.valueOf(ch));

            if (row == 0 || row == numRows - 1) {
                flag = -flag;
            }
            row += flag;
        }

        StringBuffer buffer = new StringBuffer();
        for (StringBuffer buff : resultList) {
            buffer.append(buff.toString());
        }

        return buffer.toString();
    }
}
