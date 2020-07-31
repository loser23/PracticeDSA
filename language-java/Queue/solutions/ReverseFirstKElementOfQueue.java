public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
     Queue<Integer> temp = new LinkedList<>();
     Stack<Integer> s = new Stack<>();
     while(k-->0){
         s.push(q.poll());
         
     }
     while(!s.isEmpty())temp.add(s.pop());
     while(!q.isEmpty())temp.add(q.poll());
     return temp;
    }