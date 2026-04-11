class MyStack {
int top;
ArrayList<Integer>arr;
    public MyStack() {
        arr=new ArrayList<>();
        top=-1;
    }
    
    public void push(int x) {
        top++;
        arr.add(x);
        
    }
    
    public int pop() {
        int val=arr.get(top);
         arr.remove(top);
         top--;
         return val;


    }
    
    public int top() {
        return arr.get(top);
    }
    
    public boolean empty() {
        return top==-1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */