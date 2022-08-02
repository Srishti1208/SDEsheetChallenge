public class ReverseLL{
    static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode n = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = n;
            if(n != null){
                n = n.next;
            }
        }
        return prev;
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode();
        System.out.println(reverseList(head));
    }
}