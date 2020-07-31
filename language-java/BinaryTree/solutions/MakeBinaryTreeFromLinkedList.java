 public static Tree convert(Node head, Tree node) {
       if(head==null)return null;
        Map<Integer,Tree> map = new HashMap<>();
       map.put(0,new Tree(head.data));
       head = head.next;
      
       int ind=1;
       while(head!=null){
           map.put(ind++,new Tree(head.data));
           head = head.next;
       }
       for(int i=0;i<map.size();i++){
           Tree parent = map.get(i);
           Tree left ;
           if(2*i+1<map.size())left= map.get(2*i+1);
           else left = null;
           Tree right;
           if(2*(i+1)<map.size())right=  map.get(2*(i+1));
           else right = null;
           parent.left = left;
           parent.right = right;
       }
       return map.get(0);
    }