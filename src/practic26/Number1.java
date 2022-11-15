package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Number1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack = stackPush(stack);
        System.out.println("Stack= " + stack);
        stack = stackReverse(stack);
        System.out.println("Stack new= " + stack);
    }

    public static Stack stackPush(Stack stack) {
        for(int i=0; i<10; i++) {
            stack.push(i);
        }
        return stack;
    }

    public static Stack stackReverse(Stack stack) {
        Stack temp =new Stack();
        Iterator it = stack.iterator();
        while(it.hasNext()) {
            temp.push(stack.pop());
        }
        return temp;
    }
}
