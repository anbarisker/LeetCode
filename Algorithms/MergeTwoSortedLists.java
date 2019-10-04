/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp= null;
        ListNode result = null;
        ListNode headNode =null;
        boolean end = false;
        while(l1 != null || l2 != null) {
            if(l1 !=null && l2 !=null)
            {
                if(l1.val < l2.val){
                    temp = l1;
                    l1 = l1.next;
                }
                else{
                    temp = l2;
                    l2 = l2.next;
                }
                
            }
            else if(l1 !=null && l2 == null) {
                 temp = l1;
                    l1 = l1.next;
            }
            else {
                 temp = l2;
                    l2 = l2.next;
            }
            if(headNode == null) {
                headNode = temp;
            }
            else{
                headNode.next = temp;
                headNode = headNode.next;
                
            }
            if(result == null) {
                result = headNode;
            }

        }
        
        //System.out.println(temp);
        return result;
    }
    

}