int  find(Node root,int n1,ArrayList<Node> v1){  
        if(root==null)return -1;
        if(root.data==n1){
            v1.add(root);
            return 1;
        }
        int a = find(root.left,n1,v1);
        if(a==1){
            v1.add(root);
            return 1;
        }
        int b = find(root.right,n1,v1);
        if(b==1){
            v1.add(root);
            return 1;
        }
        return -1;
    }
	Node lca(Node root, int n1,int n2)
	{
    	 if(root==null)return null;
        ArrayList<Node> v1 = new ArrayList<>();
        ArrayList<Node> v2 = new ArrayList<>();
        Node iter = root;
         int f1 = find(iter,n1,v1);
         if(f1==-1)return null;
        iter = root;
        find(iter,n2,v2);
        //System.out.println(v1+"   "+v2);
        Set<Node> s2 = new HashSet<>(v2);
       for(Node ele : v1){
           if(s2.contains(ele))return ele;
       }
       return null;
	}