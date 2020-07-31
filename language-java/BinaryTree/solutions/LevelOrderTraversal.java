static ArrayList <Integer> levelOrder(Node node) 
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(node==null)return list;
        q.add(node);
        while(!q.isEmpty()){
            Node x = q.poll();
            list.add(x.data);
            if(x.left!=null)
                q.add(x.left);
            if(x.right!=null)
                q.add(x.right);
            
        }
        return list;
    }