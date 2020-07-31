class Tree {
	public void serialize(Node root, ArrayList<Integer> list) {
	     if(root==null){
	        list.add(null);
	        return;
	        
        }
	    list.add(root.data);
	    serialize(root.left , list);
	    serialize(root.right , list);
	}
	int i;
    public Node deSerialize(ArrayList<Integer> list){
        i = 0;
        return form(list);
    }
    private Node form(ArrayList<Integer> list){
        if(i==list.size() )return null;
        if( list.get(i)==null){
            i++;
           return null;
        }
        Node iter = new Node(list.get(i));
        i++;
        iter.left = form(list);
        iter.right = form(list);
        return iter;
    }
}