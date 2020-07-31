public static int evaluatePostFix(String exp){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(c=='+'){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            else  if(c=='-'){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else  if(c=='*'){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }
            else if(c=='/'){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else st.push(Integer.valueOf(""+c));
        }
        return st.get(0);
    }