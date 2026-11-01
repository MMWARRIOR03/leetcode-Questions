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
    public int pairSum(ListNode head) {
        int count=0;
        ListNode curr=head;
        ListNode rev=head;
        ListNode prev=null;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        curr=head;
        for(int i=0;i<count;i++){
            if(i>=(count/2)){
                ListNode next=rev.next;
                rev.next=prev;
                prev=rev;
                rev=next;
            }
            else{
                rev=rev.next;
            }
        }
        count/=2;
        int max=0;
        for(int i=0;i<count;i++){
            max=Math.max((curr.val+prev.val),max);
            curr=curr.next;
            prev=prev.next;
        }
        return max;
    }
}