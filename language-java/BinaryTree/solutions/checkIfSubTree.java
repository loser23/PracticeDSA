class Tree {
    public boolean helpr(Node T , Node S,Node R){
      if(T==null && S==null)return true;
            if(T!=null && S==null)return false;
            if(T==null && S!=null)return false;
            if(T.data==S.data){
                boolean ans =  helpr(T.left , S.left,R) && helpr(T.right , S.right,R);
                if (ans) return true;
            }
    
            Node t = R;
            return helpr(T.left,t,R) || helpr(T.right,t,R);
    }
    private boolean isSubtree(Node T, Node S) {
          Node R = S;
          return helpr(T,S,R);
        }
}