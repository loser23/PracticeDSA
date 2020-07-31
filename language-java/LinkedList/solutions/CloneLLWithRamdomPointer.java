 Node copyList(Node head) {
        if(head==null)return null;
        Node iter = head;
        while(iter!=null){
            Node temp = iter.next;
            iter.next = new Node(iter.data);
            iter.next.next = temp;
            iter = temp;
        }
        iter = head;
        while(iter!=null){
            if(iter.arb==null)iter.next.arb = null;
            else
                iter.next.arb = iter.arb.next;
            iter = iter.next.next;
        }
        Node oldNode = head;
        Node newNode = head.next;
        Node temp = newNode;
        while(oldNode.next.next!=null){
            oldNode.next = oldNode.next.next;
            newNode.next = newNode.next.next;
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        oldNode.next = null;
        return temp;
    }