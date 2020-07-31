class LList
{
    Node head; 
    Node tail;
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    if(head==null){
	        head=new Node(x);
	        tail=head;
	        
	    }
	    else{
	        Node temp=new Node(x);
	        temp.next=head;
	        head=temp;
	    }
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    if(tail==null){
	        tail=new Node(x);
	        head=tail;
	    }
	    else{
	        tail.next=new Node(x);
	        tail=tail.next;
	    }
	}
	
}