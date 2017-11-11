/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Mahmoud
 */
public class CQueue {

    public Data[] cq;
    public int front,rear,elemnts;
   public int maxsize;

    public CQueue(int s) {
maxsize=s;
        cq = new Data[maxsize];
        front = 0;
        rear = -1;
        elemnts = 0;
    }

    public void insert(Data j) {
        if (rear == maxsize- 1) {
            rear = -1;
        }
        cq[++rear] = j;
        elemnts++;
        
    }

    public Data remove() {
        cq[front]=null;
        Data temp = cq[front++];
        if (front == maxsize) {
            front = 0;
        }
        elemnts--;
        return temp;
    }

    public boolean isEmpty() {
        return (elemnts == 0);
    }

    public boolean isFull() {
        return (elemnts == cq.length);
    }

    public int size() {
        return elemnts;
    }
    
    
     public String getFrontElement() {
        return cq[(front) % maxsize].display();
    }

    public String getRearElement() {
        return cq[rear % maxsize].display();
    }
    
    public void clear(){
    
     while(!isEmpty()){
     remove();
     }
    }
    
    
     @Override
    public String toString() {
        StringBuffer s = new StringBuffer("  ");
      
            for (int i = 0; i <maxsize; i++) {
            if (cq[i] == null) {
                s.append(" .. ");
            } else {
                s.append(cq[i].display()).append(" ");
            }
        }
        if (rear >= 0||rear==-1) {
            s.delete(s.length() - 1, s.length());
        }
        return new String(s) +" ";
    }
   
} 
    

