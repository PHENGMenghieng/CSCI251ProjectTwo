/**
 * class MyStack: A stack class implemented by using ArrayList
 * All stack elements are stored in an ArrayList. The top element
 * has index top
 * 
 * @author Hieng
 * @version CSCI 251 Project Two
 */
import java.util.ArrayList;

public class MyStack<E>
{
    private ArrayList<E> list; // used to store elements in stack
    private int top; // the index of top element (-1 when the stack is empty)
    
    /**
     * constructor construct an empty stack
     */
    public MyStack()
    {
        list = new ArrayList<E>();
        top = -1;
    }
    
    /**
     * push push a given element on the top of the stack
     */
    public void push(E item)
    {
        list.add(item); // append at the end, which is the top
        top++;
    }
    
    /**
     * isEmpty return true if the stack is empty; false otherwise
     * @return true if the stack is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    /**
     * peek Return the top element
     * @return the top element, or null if the stack is empty
     */
    public E peek()
    {
        if (isEmpty())
            return null;
        return list.get(top);
    }
    
    /**
     * pop Remove the top element from the stack. If the stack is empty,nothing happen
     */
    public void pop()
    {
        if (isEmpty())
            return;
        list.remove(top);
        top--;
    }
    
    /**
     * size return the size of the stack
     * @return number of elements in stack
     */
    public int size()
    {
        return top + 1;
    }
}
