int getNthFromLast(Node head, int n)
    {
        int count = 0;
        Node fast = head;
        Node sec = head;
        while( count++<n){
            if(fast==null)return -1;
            fast = fast.next;
            
        }
      
        while(fast!=null){
            fast = fast.next;
            sec = sec.next;
        }
        return sec.data;
    }