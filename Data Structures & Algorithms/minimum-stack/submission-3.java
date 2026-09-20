class MinStack {
    PriorityQueue<Integer>min;
    Deque<Integer>stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        min = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        min.add(val);
        
    }
    
    public void pop() {
        min.remove(stack.pop());
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
