//v.2.0
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==1) return 1;
		if(s==null) return 0;
		boolean [] check=new boolean[256];
		int maxLen=0,maxStart=0,len=0,start=0;
		//scan from left to right with interval of length 1
		for(int i=0;i<s.length();i++){
			java.util.Arrays.fill(check, false);
			len=0;
			start=i;
			for(int j=i;j<s.length();j++){
				char c =s.charAt(j);
				if(check[(int)c]){
					len=j-i;//did not clarify j-i-1 or j-i
					start=i;
					break;
				}
				else{
					check[(int)c]=true;
				}
				len=j-i+1;
			}
			
			if(len>maxLen){
				maxLen=len;
				maxStart=start;
			}


		}
		// for(int i=0;i<256;i++){
		// 	char c=(char)i;
		// 	int e = (int)c;
		// 	System.out.println(e);
		// }
		return maxLen;
	}
	public static void main(String [] args){
		Solution s = new Solution();
		int l = s.lengthOfLongestSubstring("au");//test "a", "au" 
		System.out.println(l);
	}
}