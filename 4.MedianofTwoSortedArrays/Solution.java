/*
There are two sorted arrays nums1 and nums2 of size m and n respectively. 
Find the median of the two sorted arrays. 
The overall run time complexity should be O(log (m+n)).

*/
//  |123
//  |123
//  112233
// average of (m+n)/2, (m+n)/2-1 
//  123
//  1234
//  1122334
//  index = (int)(m+n)/2
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int rounds=(int)(m+n)/2+1;;
        int c=0;
        int i=0,j=0;
        int[] nums3 = new int[m+n];
        while(c<rounds){
        	if(m==i){
        		nums3[c]=nums2[j];
        		j++;
        	}
        	else if(n==j){
        		nums3[c]=nums1[i];
        		i++;
        	}
        	else if((nums1[i]>=nums2[j])){
        		nums3[c]=nums2[j];
        		j++;//
        	}
        	else if(nums1[i]<nums2[j]){
        		nums3[c]=nums1[i];
        		i++;
        	}
        	c++;
        }   
        if((m+n)%2==0){
        	return (nums3[rounds-1]+nums3[rounds-2])*1.0/2;
        }
        else{
        	return nums3[rounds-1];
        }
    }
    public static void main(String [] args){
        Solution s = new Solution();
        int[] a={1,2,3,4};//
        int[] b={1,2,3};//
        
        double r = s.findMedianSortedArrays(a,b);
        System.out.println(r);
    }
}
