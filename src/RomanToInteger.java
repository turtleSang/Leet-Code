public class RomanToInteger {
    public static int romanToInt(String s){
      int number = 0; int pre =0; int result =0;
        for (char c: s.toCharArray()
             ) {
            switch (c){
                case 'M':
                    number = 1000;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'I':
                    number = 1;
                    break;
                default:break;
            }
            if (number <= pre){
                result += number;
            }else {
                result += number - 2*pre;
            }
            pre = number;
        }
        return result;
    }


    public static void main(String arg[]){
        int result = romanToInt("MCMXCIV");
        System.out.println(result);

    }
}


