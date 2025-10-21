class MyStack {

    public MyStack() {
        
    }
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();
    public void push(int x) {
        temp.offer(x);
        while(!q.isEmpty()){
            temp.offer(q.poll());
        }
        while(!temp.isEmpty()){
            q.offer(temp.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
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