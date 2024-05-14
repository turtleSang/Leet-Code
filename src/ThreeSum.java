import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listResult = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length -1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else {
                    listResult.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }

        return listResult;
    }

    public static void main(String arg[]) {
        int[] nums = {-1,-1, 0, 1, 1, 2};
        int[] nums2 = {0, 0, 0, 0};
        int[] nums3 = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> listResult = threeSum(nums3);
        for (List<Integer> list : listResult
        ) {
            String s = "[";
            for (int num : list
            ) {
                s += num + ",";
            }
            s += "]";
            System.out.println(s);
        }


    }
}
