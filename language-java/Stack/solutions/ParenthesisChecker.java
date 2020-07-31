static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c=='('|| c=='{' || c=='[')stack.push(c);
            else{
                if(c==')'){
                    if(stack.isEmpty() || stack.peek()!='(')return false;
                    else stack.pop();
                }
                if(c=='}'){
                    if(stack.isEmpty() || stack.peek()!='{')return false;
                    else stack.pop();
                }
                if(c==']'){
                    if(stack.isEmpty() || stack.peek()!='[')return false;
                    else stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }