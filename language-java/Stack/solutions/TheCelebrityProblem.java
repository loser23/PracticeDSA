 int getId(int arr[][], int n)
    {  
      Stack<Integer> st = new Stack<>();
      for(int i=n-1;i>=0;i--)st.push(i);
       while(!(st.size()<=1)){
            int a = st.pop();
            int b = st.pop();
            if(arr[b][a]==1 && arr[a][b]==1)continue;
            if(arr[a][b]==1)st.push(b);
            if(arr[b][a]==1)st.push(a);
        }
      if(st.isEmpty()==true)return -1;
     int x = st.pop();
     for(int i=0;i<n;i++)
        if(x!=i && arr[x][i]==1)return -1;
     for(int i=0;i<n;i++)
        if(x!=i && arr[i][x]==0)return -1;
     return x;
    }