  public static void removeLoop(Node head){
    //handling corner cases
       if(head == null || head.next==null)return;
        Node slow = head;
        Node fast  = head.next;
        while(true){
            if(fast==null || fast.next==null)return;
            if(fast ==slow) {
                slow = head;
               while(slow!=fast.next){
                   slow = slow.next;
                   fast = fast.next;
               }
               fast.next = null;
               return;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
