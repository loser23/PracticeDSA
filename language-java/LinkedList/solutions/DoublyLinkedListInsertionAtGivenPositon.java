void addNode(Node head_ref, int pos, int data)
	{   Node temp = new Node(data);
	    if(head_ref==null){
	        head_ref = temp;
	        return;
	    }
		Node iter = head_ref;
		while(pos-->0)iter=iter.next;
		Node curr = iter.next;
		iter.next =temp;
		temp.prev = iter;
		temp.next = curr;
		if(curr!=null)
		    curr.prev = temp;
		
	}