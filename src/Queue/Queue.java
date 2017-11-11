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
public class Queue {

    Data[] q;
    int front, rear;

    public Queue(int size) {
        
        q = new Data[size];
        rear = front = -1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public String getFrontElement() {
        return q[(front + 1) % q.length].display();
    }

    public String getRearElement() {
        return q[rear % q.length].display();
    }

    public void insert(Data o) {
        if ((rear + 1) % q.length == front) {
            Data[] newq = new Data[2 * q.length];
            int start = (front + 1) % q.length;
            if (start < 2) {
                System.arraycopy(q, start, newq, 0, q.length - 1);
            } else {
                System.arraycopy(q, start, newq, 0, q.length - start);
            }
            System.arraycopy(q, 0, newq, q.length - start, rear + 1);
            front = newq.length - 1;
            rear = q.length - 2;
            q = newq;
        }
        rear = (rear + 1) % q.length;
        q[rear] = o;
    }

    public Data remove() {
        if (isEmpty()) {
            return null;
        }
        front = (front + 1) % q.length;
        Data removed = q[front];
        q[front] = null;
        return removed;
    }

    public void clear() {
        for (int i = (front + 1) % q.length; i <= (front + rear + 1) % q.length; i++) {
            remove();
        }
        front = rear = -1;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("  ");
        for (int i = (front + 1) % q.length; i <= rear; i++) {
            if (q[i] == null) {
                s.append("null,");
            } else {
                s.append(q[i].display()).append("|");
            }
        }
        if (rear >= 0) {
            s.delete(s.length() - 1, s.length());
        }
        return new String(s) +" ";
    }
}
