/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Input: (6 -> 4 -> 9) + (7 -> 6 -> 4)
Output: 3 ->1-> 4 c:1  


Input: (2 -> 4 ) + (5 -> 6 -> 4)
Output: 7-> 1,1->


Input: (2 -> 4 -> 3) + (5 -> 6 )
Output: 7 -> 0 -> 8   
*/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver=0;
        ListNode l3=null;
        while(l1!=null && l2!=null)
        {
            l3=new ListNode((l1.val+l2.val+carryOver)%10);
            carryOver=(l1.val+l2.val)/10;
            
            l1=l1.next;
            l2=l2.next;
            l3=l3.next;
        }
        if(l1==null && l2!=null){
            l3=new ListNode(l2.val+carryOver);
        }
        else if(l2==null && l1!=null){
            l3=new ListNode(l1.val+carryOver);
        }
        else if (carryOver>0){
            l3=new ListNode(carryOver);
        }

        return l3;
        

    }
    public static void main(String [] args){
        Solution s = new Solution();
        // int r = s.addDigits(103);
        // System.out.println(r);
    }
}
