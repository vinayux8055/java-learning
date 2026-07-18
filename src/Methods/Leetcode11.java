package Methods;

public class Leetcode11 {

}
/*class Solution {
    public int findGCD(int[] nums) {

        int less = nums[0];
        int high = nums[0];
        for(int num : nums )
        {
            if(num < less)
            {
                less = num ;

            }
            if(num>high)
            {
                high = num ;

            }
        }

        while(high!=0)
        {
            int temp = high;
            high = less % high;
            less = temp;
        }
        return less;
    }
}

// we can another one aslo by using sort the array first then get the min and last value is larger value
/*
import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int small = nums[0];
        int large = nums[nums.length - 1];

        int gcd = 1;

        for (int i = 1; i <= small; i++) {
            if (small % i == 0 && large % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
} */