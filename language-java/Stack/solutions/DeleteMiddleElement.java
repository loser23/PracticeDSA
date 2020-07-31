public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    { 
      if(current==(sizeOfStack-1)/2)
      {   
          s.remove(current);
          return s;
      }
      return  deleteMid(s,sizeOfStack,current+1);
    } 