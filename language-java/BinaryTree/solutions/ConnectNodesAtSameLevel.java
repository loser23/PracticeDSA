 public static void connect(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        if(root==null)return;
        q.add(root);
        q.add(null);
        while(q.size()>1){
           Node x = q.poll();
           if(x==null){
               q.add(x);
           }
           else{
               x.nextRight = q.peek();
               if(x.left!=null)q.add(x.left);
               if(x.right!=null)q.add(x.right);
           }
       }
    }