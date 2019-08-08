/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode tempHeadListNode = new ListNode(0);
        ListNode LN1 = l1, LN2 =l2, currentNode= tempHeadListNode;
        int temp = 0;
        
        while(LN1!=null || LN2!=null)
        {
            int x = (LN1!=null) ? LN1.val:0;
            int y = (LN2!=null) ? LN2.val:0;
            int sum = temp+x+y;
            temp = sum/10;
            currentNode.next = new ListNode(sum%10);
            currentNode = currentNode.next;
            if (LN1 != null) LN1 = LN1.next;
            if (LN2 != null) LN2 = LN2.next;
        }
        if(temp>0)
        {
            currentNode.next = new ListNode(temp);
        }
        return tempHeadListNode.next;
    }
}