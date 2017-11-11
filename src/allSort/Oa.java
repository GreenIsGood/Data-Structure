/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allSort;

/**
 *
 * @author Mahmoud
 */
public class Oa {
     protected Data[] a;
    protected int size;
    public int arraySize;

    public Oa(int length) {
        arraySize = length;
        a = new Data[length];
        size = 0;
    }

    public void insert(Data theElement) {

        if (size == a.length) {
            Data[] b = new Data[2 * size];
            System.arraycopy(a, 0, b, 0, size);
            a = b;
        }

        a[size] = theElement;
        size++;

    }

    public boolean isEmpty() {
        return size == 0;
    }
    
     @Override
    public String toString() {
        StringBuffer s = new StringBuffer(" ");
        for (int i = 0; i < size; i++) {
            if (a[i] == null) {
                s.append("0, ");
            } else {
                s.append(a[i].display()).append(", ");
            }
        }
        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }

        s.append(" ");
        return new String(s);
    }

    public void clear() {
        a = new Data[arraySize];
        size = 0;
    }
    
}
