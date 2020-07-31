 void printSpiral(Node node) 
      {   if(node==null)return;
          Stack<Node> right = new Stack<>();
          Stack<Node> left = new Stack<>();
          StringBuilder br = new StringBuilder("");
          right.push(node);
          while(!(right.isEmpty() && left.isEmpty())){
              while(!right.isEmpty()){
                  Node x = right.pop();
                  br.append(x.data+" ");
                  if(x.right!=null)left.push(x.right);
                  if(x.left!=null)left.push(x.left);
              }
              while(!left.isEmpty()){
                  Node x = left.pop();
                  br.append(x.data+" ");
                  if(x.left!=null)right.push(x.left);
                  if(x.right!=null)right.push(x.right);
              }
          }
          
        System.out.print(br);
      }