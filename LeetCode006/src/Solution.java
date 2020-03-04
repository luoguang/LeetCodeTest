import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        List<List<String>> resultList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<String> list = new ArrayList<>();
            resultList.add(list);
        }

        int row = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            resultList.get(row).add(String.valueOf(ch));

            if (row == 0 || row == numRows - 1) {
                flag = !flag;
            }

            if (flag) {
                row++;
            } else {
                row--;
            }

        }

        StringBuffer buffer = new StringBuffer();
        for(List<String> list: resultList) {
            for(String str: list) {
                buffer.append(str);
            }
        }

        return buffer.toString();
    }
}
