 void rightView(Node node) {
        if(node==null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        while(q.size()>1){
            Node x = q.poll();
            if(x==null){
                q.add(x);
            }
            else{
                if(q.peek()==null)System.out.print(x.data+" ");
                if(x.left!=null)q.add(x.left);
                if(x.right!=null)q.add(x.right);
            }
        }
    }