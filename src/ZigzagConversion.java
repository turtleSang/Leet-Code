import java.util.*;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
//        Check null String
        if (s.length() == 0){
            return "";
        }

        List<TypeChar> listChar = new ArrayList<>();
        int rowNumber = 1;
        boolean up = true;
        for (int i = 0; i < s.length(); i++) {
            TypeChar typeChar = new TypeChar(s.charAt(i), rowNumber);
            listChar.add(typeChar);
//            update row number to next index
            if (up) {
                rowNumber++;
            } else {
                rowNumber--;
            }
            if (rowNumber == numRows){
                up = false;
            } if (rowNumber == 1){
                up = true;
            }

        }
//      sort char in row num
        listChar.sort(Comparator.comparingInt(o -> o.rowNum));
        String result = "";
        for (TypeChar typeChar: listChar
             ) {
            result = result + typeChar.a;
        }
        return result;
    }

//    Create a type has char and position of char
    static class TypeChar implements Comparator<TypeChar>{
        char a ;
        int rowNum;

        public TypeChar(char a, int rowNum) {
            this.a = a;
            this.rowNum = rowNum;
        }

        public char getA() {
            return a;
        }

        public void setA(char a) {
            this.a = a;
        }

        public int getRowNum() {
            return rowNum;
        }

        public void setRowNum(int rowNum) {
            this.rowNum = rowNum;
        }

        @Override
        public int compare(TypeChar o1, TypeChar o2) {
            return o1.rowNum - o2.rowNum;
        }
    }
    
}
