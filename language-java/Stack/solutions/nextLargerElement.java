 public static long[] nextLargerElement(long[] arr, int n) { 
        long [] temp = new long[n];
        temp[n-1] = -1L;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            if(st.isEmpty())temp[i] =-1L;
            else temp[i] = arr[st.peek()];
            st.push(i);
        }
        return temp;
    } 