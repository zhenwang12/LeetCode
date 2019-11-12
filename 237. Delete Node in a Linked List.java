/*Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
*/

public void deleteNode(ListNode node) {
        //if list length smaller than 2, nothing to delete
        if (node == null || node.next == null)
            return;
        
        //copy node's next node, and set next pointer to next's next node.
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
