
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if(head==null || head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
           slow=slow.next;
           fast=fast.next.next;

           if(slow==fast) break;

        }
        if(slow!=fast) return false;

        ListNode p=head;
        while(p!=slow)
        {
            p=p.next;
            slow=slow.next;
        }

        return true;
    }
}