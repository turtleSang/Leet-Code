public class ReverseInteger {
    public int findReverseInteger(int x){
        boolean negativeCheck = x < 0;
        int length = findLengthNumber(x);
        int[] arrNum = findListNumber(length, x);
        long increase = 1;
        long resultLong = 0;
        for (int i = arrNum.length -1; i >=0; i--) {
            resultLong += arrNum[i]*increase;
            increase = increase*10;
        }
        if (negativeCheck){
            resultLong = resultLong*(-1);
        }

        if (resultLong <= Integer.MAX_VALUE && resultLong >= Integer.MIN_VALUE){
            int result = (int) resultLong;
            return result;
        }else {
            return 0;
        }
    }

    public int[] findListNumber (int length, int x){
        int[] arrNum = new int[length];

        int i = 0;
        do {
            int num = x%10;
            arrNum[i] = Math.abs( num);
            i++;
            x = x/10;
        }
        while (x >= 1 || x <= -1);
        return arrNum;
    }

    public int findLengthNumber(int x){
        int length = 1;
        while (x >= 10 || x <= -10){
            x = x/10;
            length++;
        }
        return length;
    }
}
