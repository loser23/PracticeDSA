class solve{
	public static String infixToPostfix(String str) {
		  String postfix = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(isCharacter(ch))
                postfix+=ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix += stack.pop();
                if(stack.peek()=='(')stack.pop();
            }
            else{
                    while (!stack.isEmpty() && stack.peek()!='(' && precedence(stack.peek(),ch))
                        postfix+=stack.pop();
                    stack.push(ch);
            }

        }
        while (!stack.isEmpty())
            postfix+=stack.pop();
        return postfix;
	} 
	public static boolean isCharacter(char ch){
        if( ch == '(' || ch ==')' || ch =='^' || ch=='*'|| ch=='/' || ch=='+' || ch=='-')
            return false;
        return true;
    }
    public static boolean precedence(char x1 , char x2){
	    //there are only 5 operators : '+' , '-' , '*' , '/' , '^'
        if(x1=='^')return true;
        if((x1=='*' || x1=='/') && x2!='^')return true;
        if((x1=='+' || x1=='-') && (x2!='^' && x2!='*' && x2!='/'))return true;
        return false;
    }
}
