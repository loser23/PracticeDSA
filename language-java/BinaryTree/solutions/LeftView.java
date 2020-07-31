 void leftView(Node root)
    {
        if(root==null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        System.out.print(root.data+" ");
        while(q.size()>1){
            Node x = q.poll();
            if(x==null){
                q.add(x);
               System.out.print(q.peek().data+" ");
            }
            else{
                
                if(x.left!=null)q.add(x.left);
                if(x.right!=null)q.add(x.right);
            }
        }
     
    }