//?
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int start=0, length=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length()-1;j++){
				if(s.charAt(i)==s.charAt(j)){//forgot String.charAt. 
					for(int k=1;k<s.length()-j-1;k++){
						if(s.charAt(i+k)==s.charAt(j+k)){
							len++;
						}
						else{
							break;
						}
					}
				}
				else{

				}
			}
		}
		return 0;
	}
	public static void main(String [] args){
		Solution s = new Solution();
        // System.out.println(s.lengthOfLongestSubstring())
    }
}