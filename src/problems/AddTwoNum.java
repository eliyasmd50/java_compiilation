package problems;
import java.util.Arrays;

public class AddTwoNum {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++ ){
                    if(nums[i] + nums[j] == target){
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }
        public static void main(String[] args) {
            AddTwoNum addTwoNum = new AddTwoNum();
            int[] nums = {2,3,1,3};
            int target = 6;
            int[] arr = addTwoNum.twoSum(nums,target);
            System.out.println(Arrays.toString(arr));
        }
}
