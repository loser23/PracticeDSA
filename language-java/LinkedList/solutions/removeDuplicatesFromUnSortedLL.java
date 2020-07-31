public Node removeDuplicates(Node head) 
    {
        Set<Integer> set=new HashSet<>();
        Node iter=head;
        while(iter!=null){
            set.add(iter.data);
            iter=iter.next;
        }
        Node result=new Node(head.data);
        Node iter2=result;
        set.remove(head.data);
        iter=head.next;
        
        while(iter!=null){
            if(set.contains(iter.data)){
                iter2.next=new Node(iter.data);
                set.remove(iter.data);
                iter2=iter2.next;
            }
            iter=iter.next;
        }
        return result;
    }