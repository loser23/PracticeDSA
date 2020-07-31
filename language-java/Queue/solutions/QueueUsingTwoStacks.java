class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   if(s1.isEmpty())s1.push(x);
	   else{
	       while(!s1.isEmpty())
	        s2.push(s1.pop());
	        s1.push(x);
	        while(!s2.isEmpty())s1.push(s2.pop());
	   }
	   //System.out.println(s1);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {
	  if(s1.isEmpty())return -1;
	  return s1.pop();
    }
}
