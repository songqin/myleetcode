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
Output: 3 ->1,


Input: (2 -> 4 ) + (5 -> 6 -> 4)
Output: 7-> 1->1->0


Input: (2 -> 4 -> 3) + (5 -> 6 )
Output: 7 -> 0 -> 8   

0 + 0

*/

  // class ListNode {
  //    int val;
  // ListNode next;
  //     ListNode(int x) { val = x; }
  // }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver=0;
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        while(l1!=null && l2!=null)
        {
            l3.val=(l1.val+l2.val+carryOver)%10;
            carryOver=(l1.val+l2.val)/10;
            l1=l1.next;
            l2=l2.next;
            l3.next = new ListNode(0);
            l3=l3.next;//mistakes
        }
        if(l1==null && l2!=null){
            l3=new ListNode(l2.val+carryOver);
        }
        else if(l2==null && l1!=null){
            l3=new ListNode(l1.val+carryOver);
        }
        else {
            if(carryOver>0)
                l3.val=carryOver;
            else
                l3=null;
        }
        return head;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Li
        int r = s.addTwoNumbers(103);
        // System.out.println(r);
    }
}
