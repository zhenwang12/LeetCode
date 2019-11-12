/*Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
*/

public ListNode partition(ListNode head, int x) {
  //Create two new list, and track their start and end
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val < x) {
              //if smaller, insert node to end of before list
                if (beforeStart == null) {
                    beforeStart = head;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            } else {
              //if greater, insert node to end of after list
                if (afterStart == null) {
                    afterStart = head;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }
            head = next;
        }
        
        if(beforeStart == null) {
            return afterStart;
        }
        
  //merger two lists together
        beforeEnd.next = afterStart;
        
        return beforeStart;
    }
