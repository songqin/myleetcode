/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/

public class Solution {
	public String addBinary(String a, String b) {
        String r="";
        if(a.length()<=0 || b.length()<=0){
        	return null;
        }
        else{
	        int i_a = a.length()-1, i_b =  b.length()-1;
	        int carry=0;
	        while(i_a>=0 && i_b>=0)
	        {
    	    	int bit = Character.getNumericValue(a.charAt(i_a))+
    	    		Character.getNumericValue(b.charAt(i_b))+ carry;
    	    	if(bit%2==1){//0+1 (1+0), 1+1+1
    	    		r="1"+r;
    	    		if(bit>1) carry=1;
    	    		else carry=0;
    	    	}
    	    	else{//1+1, 0+1+1 (1+0+1) 0+0  (bug: 0+0)
    	    		r="0"+r;
    	    		if(bit>0) carry=1;
    	    		else carry=0;
    	    	}
    	    	i_a--;
    	    	i_b--;
	        }
	        int bit;
	        if(i_a<0){
	        	while(i_b>=0){
	        		bit =Character.getNumericValue(b.charAt(i_b)) + carry;
	        		if(bit%2==1){//0+1, 1+0
	        			r="1"+r;
	        			carry=0;
	        		}
	        		else{//1+1, 0+0
	        			r="0"+r;
	        			if(bit>0)
	        				carry=1;
	        			else
	        				carry=0;
	        		}
	        		i_b--;
	        	}
	        }
	        else{
	        	while(i_a>=0){
	        		bit =Character.getNumericValue(a.charAt(i_a)) + carry;
	        		if(bit%2==1){
	        			r="1"+r;
	        			carry=0;
	        			// r="1"+r;//bug
	        		}
	        		else{
	        			r="0"+r;
	        			if(bit>0)
	        				carry=1;
	        			else
	        				carry=0;
	        		}	        		
	        		i_a--;
	        	}
	        }
	        if(carry==1){
	        	r="1"+r;
	        }
        }
        
        return r;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        String a = args[0];
		String b = args[1];
        String binarySum = s.addBinary(a,b);
        System.out.println(binarySum);
    }
}