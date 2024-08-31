import java.util.Stack;

class Pair<T1, T2> {
    public T1 first;
    public T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
}

class MinStack {
    private Stack<Pair<Integer, Integer>> st;

    /** Initializes the stack object. */
    public MinStack() {
        this.st = new Stack<>();
    }
    
    /** Pushes the element val onto the stack. */
    public void push(int val) {
        int min = st.isEmpty() ? val : Math.min(st.peek().second, val);
        st.push(new Pair<>(val, min));
    }
    
    /** Removes the element on the top of the stack. */
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }
    
    /** Gets the top element of the stack. */
    public int top() {
        if (!st.isEmpty()) {
            return st.peek().first;
        }
        return -1; // Return a default value if stack is empty
    }
    
    /** Retrieves the minimum element in the stack. */
    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().second;
        }
        return -1; // Return a default value if stack is empty
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
