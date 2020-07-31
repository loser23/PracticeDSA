 public static long getMaxArea(long arr[], long n)  {
    
      Stack<Integer> leftSmall = new Stack<>();
      int[]  res = new int[(int)n];
      for(int i=0;i<(int)n;i++){
          while(!leftSmall.isEmpty() && arr[leftSmall.peek()]>=arr[i])
                leftSmall.pop();
            if(leftSmall.isEmpty())res[i] = i+1;
            else res[i] = i-leftSmall.peek();
            leftSmall.push(i);
      }
      Stack<Integer> rightSmall = new Stack<>();
      for(int i=(int)n-1;i>=0;i--){
          while(!rightSmall.isEmpty() && arr[rightSmall.peek()]>=arr[i])
            rightSmall.pop();
          if(rightSmall.isEmpty())res[i]+=n-i-1;
          else res[i] += rightSmall.peek()-i-1;
          rightSmall.push(i);
            
      }
      long max = 0L;
      for(int i=0;i<n;i++){
          long total = arr[i]*res[i];
          max = Math.max(total,max);
      }
      return max;
    }