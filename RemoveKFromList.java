// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> temp = new ListNode<>(null);
    
    ListNode<Integer> curr = l; 
    
    while(curr != null) {
        if(curr.value == k) {
            //check if its at head
            if(curr == l) {
                l = l.next;
            }
            else {
                
                curr = curr.next;
                temp.next = curr;
            }
        }
        else {
            temp = curr;
            curr = curr.next;
        }

    }
    
    return l;
}
