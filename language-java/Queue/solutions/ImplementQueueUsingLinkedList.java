class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        if(front==null){
            front = new QueueNode(a);
            rear = front;
            return;
        }
        rear.next = new QueueNode(a);
        rear =rear.next;
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
       if(front==null)return -1;
       if(front==rear){
           int t = front.data;
           front = null;
           rear = null;
           return t;
       }
       int t = front.data;
       front = front.next;
       return t;
	}
}
