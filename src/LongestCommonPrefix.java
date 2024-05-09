public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        for (String str:strs
             ) {
            if (str.length() == 0){
                return "";
            }
        }
        if (strs.length ==1){
            return strs[0];
        }

        int longestPrefix = 0;
        String firstString = strs[0];
        int maxLongest = minLenStr(strs);

        while (longestPrefix <= maxLongest-1){
            boolean check = true;
            for (int i = 1; i < strs.length; i++) {
                check = check && firstString.charAt(longestPrefix) == strs[i].charAt(longestPrefix);
                if (longestPrefix == 0 && !check){
                    return "";
                }
            }
            if (check){
                longestPrefix++;
            }else {
                break;
            }
        }
        String result = strs[0].substring(0, longestPrefix);

        return result;
    }
    public static int minLenStr(String[] strs){
        int minLength = strs[0].length();
        for (String s:strs
             ) {
            minLength = Math.min(s.length(), minLength) ;
        }
        return minLength;
    }

    public static void main(String arg[]){
        String[] strs = {"ab", "a"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
