public class MiddleofLL {
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        count /= 2;
        while(count-- != 0){
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode();
        System.out.println(middleNode(head));
    }
}
