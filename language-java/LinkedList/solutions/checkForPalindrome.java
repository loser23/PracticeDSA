boolean isPalindrome(Node head) 
    {
       if(head==null || head.next==null)return true;
       Node slow=head;
       Node fast=head;
       while(true){
           if(fast.next==null || fast.next.next==null)break;
           fast=fast.next.next;
           slow=slow.next;
       }
       Node midNext=slow.next;
       slow.next=null;
       slow=reverse(midNext);
       fast=head;
       while(slow!=null){
           if(fast.data!=slow.data)
                return false;
            slow=slow.next;
            fast=fast.next;
       }
       return true;
    }
    Node reverse(Node head){
        Node prev=null;
        Node iter=head;
        while(iter!=null){
            Node curr=iter.next;
            iter.next=prev;
            prev=iter;
            iter=curr;
        }
        return prev;
    }