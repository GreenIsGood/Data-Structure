/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allSort;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class Bu {

    protected Data[] a;
    protected int size;
    public int arraySize;

    public Bu(int length) {
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

    public void bubbleSort() {
        int out, in;
        for (out = size-1; out > 1; out--) 
        {
            for (in = 0; in < out; in++) 
            {
                if (a[in].compareTo(a[in + 1]) > 0) 
                {
                    swap(in, in + 1); 
                }
            }
        }
    }

    public void swap(int one, int two) {
        Data temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int find(Data searchKey) {
        int lowerBound = 0;
        int upperBound = size - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].equals(searchKey)) {
                JOptionPane.showMessageDialog(null, "Found at :" + curIn);
                return curIn;
            } 
            else if (lowerBound > upperBound) {
                JOptionPane.showMessageDialog(null, "Can't Find it");
                return size;
            }
            else 
            {
                if (a[curIn].compareTo(searchKey) < 0) {
                    lowerBound = curIn + 1; 
                } else {
                    upperBound = curIn - 1; 
                }
            }
        }
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
