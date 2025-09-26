class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Main {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val);
            if(cur.next != null) {
                System.out.print(" ");
            }
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = reverseList(head);

        printList(head);
    }
}