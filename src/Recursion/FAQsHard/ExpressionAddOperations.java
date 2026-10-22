package Recursion.FAQsHard;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperations {
    int n, sum;
    List<String> ans;

    void func(String str, int idx, StringBuilder sb, long currSum, long prev) {
        if (idx == n) {
            if (currSum == sum) ans.add(sb.toString());
            return;
        }
        int len = sb.length();   // remember length to restore after each choice

        for (int i = idx; i < n; i++) {
            if (i != idx && str.charAt(idx) == '0') break;   // no leading zeros
            String s = str.substring(idx, i + 1);
            long num = Long.parseLong(s);

            if (idx == 0) {
                sb.append(s);
                func(str, i + 1, sb, num, num);
                sb.setLength(len);
            } else {
                sb.append('+').append(s);
                func(str, i + 1, sb, currSum + num, num);
                sb.setLength(len);

                sb.append('-').append(s);
                func(str, i + 1, sb, currSum - num, -num);
                sb.setLength(len);

                sb.append('*').append(s);
                func(str, i + 1, sb, currSum - prev + prev * num, prev * num);
                sb.setLength(len);
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        sum = target;
        n = num.length();
        ans = new ArrayList<>();
        func(num, 0, new StringBuilder(), 0L, 0L);
        return ans;
    }
}
