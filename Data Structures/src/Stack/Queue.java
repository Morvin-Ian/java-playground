package Stack;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> data = new ArrayList<>();

    public void enqueue(int item){
        data.add(item);
    }

    public void dequeue(){
        if(!data.isEmpty())
            data.removeFirst();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void peek(){
        data.getFirst();
    }
}
