/**
 * class MyQueue implemented using ArrayList. The index 0 element is the front of the queue
 * The last element of the queue has index tail
 * @author Hieng
 * @version CSCI 251 Project Two
 */
import java.util.ArrayList;

public class MyQueue<E>
{
    private ArrayList<E> list; // hold the elements in queue
    private int tail; // index of the last element in queue (-1 when empty)
    
    /**
     * constructor construct an empty queue
     */
    public MyQueue()
    {
        list = new ArrayList<E>();
        tail = -1;
    }
    
    /**
     * isEmpty return true if the queue is empty; false otherwise
     * @return true if the queue is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return tail == -1;
    }
    
    /**
     * size return the size of the queue
     * @return the number of elements in queue
     */
    public int size()
    {
        return tail + 1;
    }
    
    /**
     * peek return the front element of the queue
     * @return the front element of the queue. If the queue is empty, return null
     */
    public E peek()
    {
        if (isEmpty())
            return null;
        return list.get(0);
    }
    
    /**
     * pop remove the front element of the queue
     * If the queue is empty, nothing happens
     */
    public void pop()
    {
        if (isEmpty())
            return;
        list.remove(0); // later elements shift down, so index 0 is the new front
        tail--;
    }
    
    /**
     * push push a new element to the queue
     */
    public void push(E item)
    {
        list.add(item); // add at the back
        tail++;
    }
}
