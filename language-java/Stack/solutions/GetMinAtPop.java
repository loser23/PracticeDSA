class GetMin
{
    
    /* inserts elements of the array into 
        stack and return the stackn*/
    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> st = new Stack<>();
        int min = arr[0];
        for(int ele : arr){
            st.push(ele);
            min = Math.min(ele,min);
            st.push(min);
        } 
        return st;
    }
    
    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>st)
    {   
        while(!st.isEmpty()){
            
            System.out.print(st.pop()+" ");
            st.pop();
        }
    }
}