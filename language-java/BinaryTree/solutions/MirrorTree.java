void mirror(Node iter) 
{
     if(iter==null)return;
     Node temp = iter.left;
     iter.left = iter.right;
     iter.right = temp;
     mirror(iter.left);
     mirror(iter.right);
}