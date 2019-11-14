/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse 
*order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
*You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p1 = l1, p2 = l2, current = result;
        
        while(p1 != null || p2 != null) {
            int x = p1 == null ? 0 : p1.val;
            int y = p2 == null ? 0 : p2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if(p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return result.next;
    }
