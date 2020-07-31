public Node insertInMid(Node head, int data){
        Node fast = head.next,slow = head;
        if(fast ==null){
           head.next = new Node(data);
           return head;
            
        }
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node curr = slow.next;
        slow.next = new Node (data);
        slow = slow.next;
        slow.next = curr;
        return head;
        
    }