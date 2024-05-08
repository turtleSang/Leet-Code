public class MostWater {
    public static int maxArea(int[] height) {
        int maxAcreage = 0;

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = height.length - 1; j > i ; j--) {
//                int y = Math.min(height[i], height[j]);
//                int x = j-i;
//                int acreage = x*y;
//                if (maxAcreage < acreage){
//                    maxAcreage = acreage;
//                }
//
//            }
//        }
        int i = 0;
        int j = height.length -1;

        while (i < j){
            int y = Math.min(height[i], height[j]);
            int x = j - i;
            int acreage = x*y;
            maxAcreage = Math.max(maxAcreage, acreage);
            if (height[i] > height[j]){
                j--;
            }else {
                i++;
            }

        }

        return  maxAcreage;
    }


}
