int minValue(Node node)
    {
        if(node==null)return -1;
        Node temp = node;
        while(temp.left!=null)temp = temp.left;
        return temp.data;
    }