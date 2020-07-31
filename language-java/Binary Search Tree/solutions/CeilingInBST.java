class GfG {
    int findCeil(Node root, int key) { 
        if (root == null)
            return -1;
        int ans = -1;
        while(root!=null){
            if(root.data==key)return key;
            if(root.data<key)root = root.right;
            else{
                ans = root.data;
                root = root.left;
            }
        }
        return ans;
    } 
}

