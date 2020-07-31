static Node segregate(Node head)
    {   if(head==null || head.next==null)return head;
        Node iter=head;
        Node prev=null;
        Node tail;
        int count=2;
        while(iter.next!=null){iter=iter.next;count++;}
        tail=iter;
        iter=head;
        Node temp1=new Node(1);
        temp1.next=head;
        head=temp1;
        iter=head;
        while(count-->0){
            if(iter==null)break;
            if(iter.data==0 ){
                Node temp=new Node(0);
                temp.next=head;
                head=temp;
                prev.next=iter.next;
                iter=prev.next;
        
            }
            else if(iter.data==2){
                tail.next=new Node(2);
                tail=tail.next;
                prev.next=iter.next;
                iter=prev.next;
            }else{
                prev=iter;
                iter=iter.next;
            }
        }
        if(head.data==1){
            head=head.next;
        }else{
            prev=head;
            iter=head.next;
            while(iter!=null){
                if(iter.data==1){
                    prev.next=iter.next;
                    break;
                }else{
                    prev=iter;
                    iter=iter.next;
                }
            }
        }
        
        return head;
    }