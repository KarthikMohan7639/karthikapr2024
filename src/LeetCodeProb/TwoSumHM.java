package LeetCodeProb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHM
    /*
    Leetcode problem no: 1
     */
{
    public int[] twoSum(int [] nums, int target) {
//        Map<Integer, Integer> complements = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//           Integer complementIndex= complements.get(nums[i]);
//           if (complementIndex != null) {
//               return new int[]{i, complementIndex};
//           }
//           complements.put(target - nums[i], i);
//        }
//        return nums;
        int p1=0, p2=nums.length-1;
        while(p1<p2) {
            int sum = nums[p1] + nums[p2];
            if(sum == target) {
                return new int[]{p1, p2};
            }
            else if(sum < target) {
                p1++;
            }
            else
                p2--;
        }
        return new int[]{-1, -1};
    }
        public static void main(String[] args) {
        int nums[]={3,2,4};
        int target=6;
        TwoSumHM hm=new TwoSumHM();
        int[] result=hm.twoSum(nums, target);
            System.out.println(Arrays.toString(result));
    }
}
