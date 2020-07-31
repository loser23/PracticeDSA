 int getMaxWidth(Node root)
    {   if(root==null)return 0;
        int max = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int curr=0;
        while(q.size()>1){
            Node x = q.poll();
            if(x==null){
                max = Math.max(max,curr);
                q.add(x);
                curr=0;
            }
            else{
                ++curr;
                if(x.left!=null)q.add(x.left);
                if(x.right!=null)q.add(x.right);
            }
        }
        max = Math.max(max,curr);
        return max;
    }		