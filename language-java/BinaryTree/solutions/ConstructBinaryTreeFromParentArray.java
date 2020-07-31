 public static Node createTree(int arr[], int n)
    {
        
        Map<Integer , Node> map = new HashMap<>();
        for(int i =0;i<n;i++)
            map.put(i,new Node(i));
        Node root = null;
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                root = map.get(i);
                continue;
            }
            Node parent = map.get(arr[i]);
            if(parent.left==null)parent.left = map.get(i);
            else parent.right = map.get(i);
        }
        return root;
    
    }