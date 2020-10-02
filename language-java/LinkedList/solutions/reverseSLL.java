class ReverseLL
{   
    // This function should reverse linked list and return
    // head of the modified linked list.
    //recursive solution
    Node reverseList(Node head)
    {
       if(head==null)return null;
       return reverse(head,null);
    }
    private Node reverse(Node iter, Node prev){
        Node curr = iter.next;
        iter.next = prev;
        if(curr!=null)return reverse(curr,iter);
        return iter;
    }
    
}
