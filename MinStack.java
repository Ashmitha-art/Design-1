// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 A stack is used to store values and perform push and pop operations using the built in data structure. 
 A min stack is also created which stores the minimum element at every instance. 
 If the top element on min stack and stack is same, then min stack is also popped out. 
 The min stack makes it easy to peek into it and performs it in O(1). 
 */
import java.util.Stack;
class MinStack {
private Stack <Integer> stack;
private Stack <Integer> minStack;
    MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()||val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    void pop() {
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    int top() {
        return stack.peek();
    }
    
    int getMin() {
        return minStack.peek();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */