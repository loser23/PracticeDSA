public int detectLoop(Node head) {
        if(head==null || head.next==null)return 0;
        Node dummy = new Node(0);
        while (head.next!=dummy && head.next!=null){
            Node temp = head.next;
            head.next =  dummy;
            head = temp;
        }
        if(head.next==null)return 0;
        return 1;
        
    }