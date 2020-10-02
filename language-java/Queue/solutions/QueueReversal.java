 public Queue<Integer> rev(Queue<Integer> q){
       //we will use stack to reverse , arraylist can also be used instad of stack
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty())
            st.push(q.poll());
        while(!st.isEmpty())
            q.add(st.pop());
        return q;
    }
