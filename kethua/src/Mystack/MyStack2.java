package Mystack;

import java.util.Stack;

public class MyStack2 implements Function{
    Stack st = new Stack<Object>();
    public void push(Object o){
        st.push(o);
    }
    public Object pop(){
        return st.pop();
    }
    public Boolean isEmpty(){
        return st.empty();
    }
}
