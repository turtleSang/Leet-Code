public class ZigzagConversion2 {
    public static String convert2(String s, int numRows){
        if (s.length()<=1 || numRows == s.length() || numRows ==1){
            return s;
        }
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        int currentRow = 1;
        int index = 0;
        boolean up = true;
        while (index < s.length()){
            char a = s.charAt(index);
            rows[currentRow -1] += a;
            if (up){
                currentRow++;
            }else {
                currentRow--;
            }
            if (currentRow == numRows){
                up = false;
            }if(currentRow == 1) {
                up = true;
            }
            index++;
        }
        String result = "";
        for (String txt: rows
             ) {
            result+= txt;
        }

        return result;
    }
}
