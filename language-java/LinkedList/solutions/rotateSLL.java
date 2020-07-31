  public Node rotate(Node head, int k) {
        Node iter=head;
        while(k-->1)iter=iter.next;
        Node newHead=iter.next;
        if(newHead==null)return head;
        iter.next=null;
        iter=newHead;
        while(iter.next!=null)iter=iter.next;
        iter.next=head;
        return newHead;
    }