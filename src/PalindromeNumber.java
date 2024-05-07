public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int len = findLength(x);
        if (len == 1){
            return true;
        }
        int[] listNumber = new int[len];
        int index = 0;
        while (x>=1){
            int num = x%10;
            listNumber[index] = num;
            x = x/10;
            index++;
        }
        for (int start = 0; start <= listNumber.length/2; start++) {
            int end = listNumber.length -1 - start;
            if (listNumber[start] != listNumber[end]){
                return false;
            }
        }

        return true;
    }

    public static int findLength(int x){
        int len = 1;
        while (x >= 10){
            x = x/10;
            len++;
        }
        return len;
    };
}
