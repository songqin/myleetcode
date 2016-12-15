/*

Total Accepted: 156754 Total Submissions: 644040 Difficulty: Medium Contributors: Admin

Given a string s, find the longest palindromic substring in s. 
You may assume that the maximum length of s is 1000.

A palindrome is a word, phrase, number, or other sequence of characters 
which reads the same backward or forward, such as madam or kayak.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example:
Input: "cbbd"
Output: "bb"

思路：
对称的情况有2：
1 中间一个字母x，左右离x等距离的字母相同  e.g., aba

2 中间两个字母yz，右边离y的距离相同的字母==左边离x距离相同的字母 e.g., abba

注意：index out of bound的时候，停止scan




*/

public class Solution {
    //solver
    public String longestPalindrome(String s) {
        System.out.println(s.length());
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
        	System.out.print(arr[i]+" ");
        }  
        System.out.println();     
        return s;    
    }    

    public static void main(String [] args){
        Solution s = new Solution();
        String s1 = "abcdefg";
        s.longestPalindrome(s1);
    }
}