class MinStack {
    Stack<Integer>St=new Stack<>();
    Stack<Integer> minSt=new Stack<>();

    public MinStack() {//constructer
        
    }
    
    public void push(int val) {
        if(St.size()==0){
            St.push(val);
            minSt.push(val);
        }
        else{
            St.push(val);
            if(minSt.peek()<val) minSt.push(minSt.peek());
            else minSt.push(val);
        }
        
    }
    
    public void pop() {
        St.pop();
        minSt.pop();
        
    }
    
    public int top() {
        return St.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */