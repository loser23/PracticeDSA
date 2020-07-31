class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {   if(q1.isEmpty())return -1;
	    return q1.poll();
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {  q2.clear();
	   q2.add(a);
	 while(!q1.isEmpty())
	    q2.add(q1.poll());
	while(q2.isEmpty()==false)
	    q1.add(q2.poll());
	 
	   
    }
}

