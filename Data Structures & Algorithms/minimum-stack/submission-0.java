class MinStack {
    private Stack<Integer>s;

    public MinStack() {
        s =  new Stack<>();
    }
    
    public void push(int val) {
            s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int min = s.peek();
        Stack<Integer>temp = new Stack<>();
        while(!s.isEmpty()){
            min = Math.min(min,s.peek());
            temp.push(s.pop());
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return min;
    }
}
