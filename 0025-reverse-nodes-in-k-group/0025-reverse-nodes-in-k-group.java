/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=0;
        ListNode len=head;
        while(len!=null){
            len=len.next;
            n++;
        }

        int stop=n-(n%k);
        int groups=n/k;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevG=dummy;
        for(int g=0;g<groups;g++){
            ListNode grTail=prevG.next;
            ListNode curr=prevG.next;
            ListNode prev=null;
            
            for(int j=0;j<k;j++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            prevG.next=prev;
            grTail.next=curr;
            prevG=grTail;
        }
        return dummy.next;
    }
}