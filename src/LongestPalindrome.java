import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public static String longestPalindrome(String s){
        int len = s.length();
        if (len == 0 || len == 1){
            return s;
        }
        String result = "" + s.charAt(0);

        for (int start = 0; start < len; start++) {
            for (int end = len; end > start+1; end--){
                String sub = s.substring(start, end);
                boolean check = testPalindrome(sub);
                if (check && result.length()< sub.length()){
                   result = sub;
                   break;
                }
            }
        }

        return result;
    };

    public static boolean testPalindrome(String sub){
        int len = sub.length();
        for (int start = 0; start < len/2; start++) {
           int end = len -start - 1;
           if (sub.charAt(start)!= sub.charAt(end)){
               return false;
           }
        }
        return true;
    };
}
