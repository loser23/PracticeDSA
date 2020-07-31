int countNodesinLoop(Node head)
    {   
        if(head==null )return 0;
        if(head.next==head ){
            return 1;
        }
	    Node fast=head;
	    Node slow=head;
	    boolean isLoop=false;
	    int z=99999999;
	    while(z-->0){
	        if(fast==null || fast.next==null){
	            isLoop=false;
	            break;
	        }
	        fast=fast.next.next;
	        slow=slow.next;
	        if(fast==slow){
	            isLoop=true;
	            break;
	        }
	    }
	    if(!isLoop)
	        return 0;
	    slow=head;
	    while(slow!=fast){
	        slow=slow.next;
	        fast=fast.next;
	    }
	    int count=1;
	    fast=fast.next;
	    while(fast!=slow){
	        fast=fast.next;
	        count++;
	    }
	    return count;
    }