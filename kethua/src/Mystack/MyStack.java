package Mystack;

import java.util.ArrayList;

public class MyStack implements Function{
    ArrayList<Object> arr = new ArrayList<Object>();
    public void push(Object o){
        arr.add(o);
    }
    public Object pop(){
        Object o = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return o;
    }
    public Boolean isEmpty(){
        return arr.isEmpty();
    }
}
