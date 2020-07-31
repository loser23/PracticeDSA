class GfG {
    // Complete the function
    int i;
    public  Node buildTree(int in[], int post[], int n) {
        i=n-1;
        int start = 0;
        int end = n-1;
        return build(in , post , start , end);
    }

    private Node build(int in[] , int post[] , int start , int end){
        if(start>end)return null;
        Node iter = new Node(post[i]);
        int ind =-1;
        for(int j = start ; j<=end;j++){
            if(in[j]==post[i]){
                ind = j;
                break;
            }
        }
        i--;
        iter.right = build(in,post,ind+1,end);
        iter.left = build(in,post,start,ind-1);
        return iter;
        
    }
   
}
