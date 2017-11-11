package linkedlist;

import java.util.EmptyStackException;

public class LinkedStack {
    protected LinkedStackNode top;
    protected int size ;

   
    public LinkedStack() {
        
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void push(Object o){
        if(o==null)
            throw new IllegalArgumentException("can't insert null");
        top =new LinkedStackNode(o, top);
        size++;
    }
    public Object pop(){
        if(isEmpty())
            throw new EmptyStackException();
        Object pop =top.element;
        top=top.next;
        size--;
        return pop;
    }
    public Object peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return top.element;
    }
    public void clear(){
        while(top!=null)
            pop();
    }
    public String toString(){
        StringBuffer s=new StringBuffer("[");
        LinkedStackNode current=top;
        while(current!=null){
            s.append(current.element+",");
            current=current.next;
        }
        if(size>0)
        s.delete(s.length()-1,s.length());
        return new String(s)+"]";
    }
    
}
