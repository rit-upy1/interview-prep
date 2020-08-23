package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        Set<Integer> distinctNums = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; ++i) {
            
            if (distinctNums.contains(nums[i])) {
                //System.out.println("Contains" + nums[i]);
                return true;
            }
            else {
                distinctNums.add(nums[i]);
                //System.out.println("Adding" + nums[i]);
            }
        }
        return false;
    }
}