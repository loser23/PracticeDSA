 public static Node pairwise_swap(Node head)
    {
         if(head==null|| head.next ==null)return head;
        Node fast = head.next;
        Node slow  = head;
        while(true){
            if(fast==null )break;
            int temp = fast.data;
            fast.data = slow.data;
            slow.data = temp;
            if(fast.next==null)break;
            slow = slow.next.next;
            fast = fast.next.next;
        }
        return head;
    }