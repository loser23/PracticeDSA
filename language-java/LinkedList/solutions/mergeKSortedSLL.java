class Merge
{
    Node mergeKList(Node[]a,int N)
    {
        if(a.length==1){
            return a[0];
        }
        Node[] temp = new Node[(N+1)/2];
        int index = 0;
        for(int i=0;i<N;){
            if(i==N-1){
                temp[index++] = a[i];
                i++;
            }else{
                temp[index++]= merge(a[i],a[i+1]);
                i+=2;
            }
        }
        return mergeKList(temp,temp.length);
    }
    private static Node merge(Node a,Node b){
        Node res = new Node(0);
        Node iter = res;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                iter.next = new Node(a.data);
                a=a.next;
            }else{
                iter.next = new Node(b.data);
                b = b.next;
            }
            iter=iter.next;
        }
        while(a!=null){
            iter.next = new Node(a.data);
                a=a.next;
                iter=iter.next;
        }
        while(b!=null){
            iter.next = new Node(b.data);
                b = b.next;
            
            iter=iter.next;
        }
        return res.next;
    }
}