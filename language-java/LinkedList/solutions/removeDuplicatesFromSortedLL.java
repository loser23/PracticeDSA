Node removeDuplicates(Node head)
    {
        if(head==null || head.next==null)return head;
        Node temp=new Node(Integer.MAX_VALUE);
        temp.next=head;
        head=temp;
        Node bord=head;
        Node iter=head.next;
        while(iter!=null){
            if(bord.data!=iter.data){
                bord=bord.next;
            }else{
                bord.next=iter.next;
            }
            iter=iter.next;
        }
        return head.next;
    }