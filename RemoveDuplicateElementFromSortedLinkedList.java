// Remove duplicate element from sorted Linked List

// Example 1:

// Input:
// LinkedList: 2->2->4->5
// Output: 2 4 5
// Explanation: In the given linked list 
// 2 ->2 -> 4-> 5, only 2 occurs more 
// than 1 time. So we need to remove it once.

  class Ajay
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	Node node = head;
	
	while(node != null && node.next != null) {
	    if(node.data == node.next.data) {
	        node.next = node.next.next;
	    } else {
	        node = node.next;
	    }
	}
	return head;
	
	
    }
}
