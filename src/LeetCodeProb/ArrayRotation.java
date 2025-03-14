package LeetCodeProb;

import java.util.Arrays;

public class ArrayRotation {
    public static void ArrayRotation(int[] nums, int k){
        for(int i = 1; i <= k; i++){
            int first = nums[nums.length -1];
            for(int j =0; j<nums.length; j++){
                nums[j+1] = nums[j];
            }
            nums[0] = first;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int count=1;
        ArrayRotation(arr,count);
    }
}
