 static void levelOrder(Node node) 
    {
       Queue<Node> q = new LinkedList<>();
       q.add(node);
       q.add(null);
       while(q.size()>1){
           Node x = q.poll();
           if(x==null){
               System.out.print("$ ");
               q.add(x);
           }
           else{
               System.out.print(x.data+" ");
               if(x.left!=null)q.add(x.left);
               if(x.right!=null)q.add(x.right);
           }
       }
        System.out.print("$ ");
    }