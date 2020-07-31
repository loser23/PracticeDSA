Node swapkthnode(Node head, int num, int K)
    
    {   
        //K = Math.min(K,num-K+1);
        Node prev1 = null;
        Node curr1 = head;
        int x = K;
        while(x-->1){
            if(curr1==null)return head;
            prev1 = curr1;
            curr1 = curr1.next;
        }
        x = num-K;
        Node prev2 = null;
        Node curr2 = head;
        while(x-->1){
            prev2 = curr2;
            curr2 = curr2.next;
        }
        Node temp1 = curr1.next;
        Node temp2 = curr2.next;
        if( K==1){
            prev2.next = curr1;
            curr1.next = temp2;
            curr2.next = temp1;
            return curr2;
        }
        if(K==num){
             prev1.next = curr2;
            curr2.next = temp1;
            curr1.next = temp2;
            return curr1;
        }
        if(K-1 ==num-K)return head;
        if(prev1==curr2){
            prev2.next = temp2;
            curr1.next = curr2;
            curr2.next = curr2;
            curr2.next = temp1;
            return head;
        }
        if(prev2 == curr1){
            prev1.next =temp1;
            curr2.next =prev2;
            prev2.next = temp2;
            return head;
            
        }
        prev1.next = curr2;
        prev2.next = curr1;
        curr2.next = temp1;
        curr1.next = temp2;
        Node iter = head;
        
        return head;
       
    }