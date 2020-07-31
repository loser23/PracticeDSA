class Solution{
    Stack<Node> st ; 
    Set<Node> set;
    int printKDistantfromLeaf(Node root, int k)
    {
        if(root==null)return 0;
    	 st = new Stack<>();
    	 set = new HashSet<>();
    	 findCount(root , k);
    	 return set.size();
    }
    void findCount(Node iter , int k ){
        st.push(iter);
        if(iter.left==null && iter.right==null){
            if(st.size()<k+1)return;
            Node get = st.get(st.size()-(k+1));
            set.add(get);
            return;
        }
        if(iter.left!=null){
            findCount(iter.left , k);
            st.pop();
        }
            
        if(iter.right!=null){
             findCount(iter.right , k);
            st.pop();
        }
           
    }

}
