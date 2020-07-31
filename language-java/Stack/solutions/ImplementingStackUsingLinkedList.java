class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        if(top==null)top = new StackNode(a);
        else {
            StackNode temp = new StackNode(a);
            temp.next = top;
            top = temp;
        }
    }
    int pop() {
        if(top==null)return -1;
        int temp = top.data;
        top = top.next;
        return temp;
    }
}
