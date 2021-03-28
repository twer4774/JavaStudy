package Collection.arraylist.stack;

import java.util.ArrayList;

class MyGenericsStack<T>{
    private ArrayList<T> arrayStack = new ArrayList<T>();

    public void push(T data){
        arrayStack.add(data);
    }

    public T pop(){
        int len = arrayStack.size();
        if(len == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return (arrayStack.remove(len - 1));
    }
}


public class GenericsStack {
    public static void main(String[] args) {
        MyGenericsStack stack = new MyGenericsStack();
        stack.push("A");
        stack.push(3);
        stack.push(true);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
