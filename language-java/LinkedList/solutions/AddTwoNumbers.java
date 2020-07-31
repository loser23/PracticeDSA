 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1,t2=l2;
        ListNode sum=new ListNode();
        int s=t1.val+t2.val;
        ListNode t3=sum;
         t3=new ListNode(s%10);
        if(s>9){ 
            if(l1.next!=null) l1.next.val+=1;
            else if(l2.next!=null) l2.next.val+=1;
            else{
                t3.next=new ListNode(1);
                return t3;
            }
            
            }
        t1=t1.next;
        t2=t2.next;
        sum=t3;
        while(true){
            if(t1==null || t2==null)
                break;
             s=t1.val+t2.val;
            if(s>9){
                  t3.next=new ListNode(s%10);
                if(t1.next!=null){
                  t1.next.val+=1;
                }
                else if(t2.next!=null){
                   
                    t2.next.val+=1;
                }
                else{
                    t3.next.next=new ListNode(1);
                    return sum;
                }
            }
            else t3.next=new ListNode(s);
            t3=t3.next;
            t1=t1.next;
            t2=t2.next;
        }
        if(t1==null){
             while(t2!=null){
                s=t2.val;
                t3.next=new ListNode(s%10);
                if(s>9){
                    if(t2.next!=null)
                        t2.next.val+=1;
                    else
                        t3.next.next=new ListNode(1);
                    
                }
                   
                t3=t3.next;
                t2=t2.next;
            }
        }
        if(t2==null){
            while(t1!=null){
                s=t1.val;
                t3.next=new ListNode(s%10);
                if(s>9){
                    if(t1.next!=null)
                        t1.next.val+=1;
                    else
                        t3.next.next=new ListNode(1);
                    
                }
                   
                t3=t3.next;
                t1=t1.next;
            }
        }
        return sum;
       
        
    }