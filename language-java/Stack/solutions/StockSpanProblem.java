 {   
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[n];
        temp[0]=1;
        st.push(0);
        for(int i =1;i<n;i++){
           while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
               st.pop();
           }
           if(st.isEmpty())temp[i] = i+1;
           else
                temp[i] = i-st.peek();
           st.push(i);
        }
        return temp;
    }