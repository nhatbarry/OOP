package Mystack;

import lab12.cau2.CanBo;
import lab8.Nguoi;
import lab92.*;

public class Main {
    public static void main(String[] args) {

        MyStack2 stack = new MyStack2();
        stack.push(1);
        stack.push(2);
        stack.push("ba");
        stack.push("bon");
        stack.push("nam");
        stack.push(6.0);
        stack.push(7.6);
        stack.push(8.9);
        stack.push(new CBGV());
        stack.push(new Nguoi());
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
