/* Given a sorted linked list, delete all duplicates such that each element appear only once.
*/

public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            //if current value equals next value, remove next one
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
