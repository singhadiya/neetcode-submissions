class MinStack {
   Deque<Integer>minstack;
    Deque<Integer>stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        minstack.push(Math.min(val,minstack.isEmpty()?val:minstack.peek()));
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
