/*
221 / 1101 test cases passed.
Easy

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/
public class Solution2 {
	
    public int addDigits(int num) {
	   int sum;
       do{
            sum=0;
	       while(num>0){
		      sum=sum+num%10;
		      num/=10;
	       }
	   }while(sum>=10);
	   return sum;
    }

    public static void main(String [] args){
		Solution2 s = new Solution2();
		int r = s.addDigits(103);
		System.out.println(r);
    }
}