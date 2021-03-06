//Latest version of the solution
/*
Given an array S of n integers, 
find three integers in S such that 
the sum is closest to a given number, target. 
Return the sum of the three integers. 
You may assume that each input would have exactly one solution.
For example, given array S = {-1 2 1 -4}, and target = 1.
    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

/*

test cases:
	special case: 3 numbers
	
	Input:
	[0,2,1,-3]
	1
	Output:
	3
	Expected:
	0


*/
import java.util.Arrays;
public class Solution {
    /*
    sort array
    3 index pointer, i, j ,k 
    sum of num@i(0),j(1),k(length-1)
    while(j<k) do
        if sum = target, return sum
        if sum > target, k--
        if sum < target, i++,j++
    */
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closet=Integer.MAX_VALUE/2;// otherwise it will overflow for opeartion (closet-target)'
        if(n==3) return nums[0]+nums[1]+nums[2];
        else{
        	for(int i=0;i<n-2;i++){
        		int j=i+1, k=n-1;
        		while(j<k){
        			int sum=nums[i]+nums[j]+nums[k];
	        		if(sum==target) return sum;
	        		else if(sum<target) j++;
	        		else{
	        			k--;
	        		}
	        		closet = Math.abs(sum - target) < Math.abs(closet - target) ? sum : closet;
        		}
        	}
        	return closet;
        }
    }
         public static void main(String [] args){
        Solution s = new Solution();
        int [] numbers = {0,2,1,-3}; 
        System.out.println(s.threeSumClosest(numbers, 1)); // Expected: 2
    }
}