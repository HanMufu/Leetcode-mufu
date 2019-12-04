public class Solution {

    public static boolean isPalindrome(ListNode head) {
        ListNode reversedHead = reverse(head);
        ListNode p = head, q = reversedHead;
        while(p != null && q != null) {
            if(p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        if(p != null || q != null) {
            return false;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while(curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    public static void main(String []args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = c;
        System.out.println(isPalindrome(a));
    }

}