import java.util.ArrayList;
import java.util.List;

class MyQueue {
    // store elements
    private List<Integer> data;
    // a pointer to indicate the start position (head)
    private int p_head;
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_head = 0;  // set initial val to head pointer on first element in list
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_head++;
        return true;
    }
    /** Get the front item from the queue. */
    public int getHead() {
        return data.get(p_head);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_head >= data.size();
    }
};

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.getHead());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.getHead());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.getHead());
        }
    }
}