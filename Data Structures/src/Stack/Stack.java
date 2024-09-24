package Stack;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> data = new ArrayList<>();

    public void push(int item){
        data.add(item);
    }

    public void pop(){
        data.removeLast();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void peek(){
        data.getLast();
    }

}
