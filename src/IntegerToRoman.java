public class IntegerToRoman {
    public static String intToRoman(int num){
        int len = lengthOfNumber(num);
        int[] figureList = arrayNumber(num, len);
        String result = "";
        for (int fig: figureList
             ) {
            result = transferRoman(fig) + result;
        }


        return result;
    }

    public static int[] arrayNumber(int number, int length){
        int result[] = new int[length];
        int index = 0;
        int base = 1;
        while (number >= 1){
            int figure = number%10;
            result[index] = figure*base;
            index++;
            base*=10;
            number /=10;
        }

        return  result;
    };

    public static int lengthOfNumber(int number){
        int len = 1;
        while (number >= 10){
            len++;
            number /=10;
        }
        return len;

    }

    public static String transferRoman(int number){
        String result = "";
        if (number >= 1000){
            int times = number/1000;
            for (int i = 0; i < times; i++) {
                result += "M";
            };
        } else if (number >= 500){
            int times = number/100;
            if (times == 9){
                result = "CM";
            }else{
                result = "D";
                times = (number-500)/100;
                for (int i = 0; i < times; i++) {
                    result += "C";
                }
            }
        } else if (number >= 100){
            int times = number/100;
            if (times == 4){
                result = "CD";
            }else {
                for (int i = 0; i < times; i++) {
                    result += "C";
                }
            }
        } else if (number >= 50){
            int times = number/10;
            if (times == 9){
                result = "XC";
            }else {
                times = (number -50)/10;
                result = "L";
                for (int i = 0; i < times; i++) {
                    result += "X";
                }
            }
        } else if (number >= 10){
            int times = number/10;
            if (times == 4){
                result = "XL";
            }else {
                for (int i = 0; i < times; i++) {
                    result += "X";
                }
            }
        } else if (number >= 5){
            if (number == 9){
                result = "IX";
            }
            else {
                result = "V";
                int times = (number-5);
                for (int i = 0; i < times; i++) {
                    result += "I";
                }
            }
        }else {
            if (number == 4){
                result = "IV";
            }else {
                for (int i = 0; i < number; i++) {
                    result += "I";
                }
            }
        }
        return result;
    }


}
