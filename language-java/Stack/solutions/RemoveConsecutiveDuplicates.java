  public static String removeConsecutiveDuplicates(String str){
        if(str.isEmpty())return "";
        Stack<Character> stack = new Stack<>();
       StringBuilder temp = new StringBuilder();
        stack.push(str.charAt(0));
        temp.append(str.charAt(0));
        for(int i = 1 ; i<str.length();i++){
            char c = str.charAt(i);
            if(stack.peek()!= c)temp.append(c);
            stack.push(c);
        }
        return String.valueOf(temp);
    }