class MinStack {
    private Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        System.out.println(" pushed value : "+val);
    }
    
    public void pop() {
       int temp = s.pop(); 
       System.out.println(" poped value : "+temp);  
    }
    
    public int top() {
        System.out.println(" top value : "+s.peek());
        return s.peek();
    }
    
    public int getMin() {
        int min = 0;
        int current = 0;
        if(!s.isEmpty()){
          min = s.peek();
        }
        Stack<Integer>temp = new Stack<>();
        while(!s.isEmpty()){
          current = s.pop();
          min = Math.min(current,min);
          temp.push(current);
        }
        while(!temp.isEmpty()){
          current = temp.pop();
          min = Math.min(current,min);
          s.push(current);
        }
        System.out.println(" minimum value : "+min);
        return min;
    }
}
