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
public class Se {

    protected Data[] a;
    protected int size;
    public int arraySize;

    public Se(int length) {
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

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < size - 1; out++) {
            min = out; 
            for (in = out + 1; in < size; in++) {
                if (a[in].compareTo(a[min]) < 0) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        Data temp = a[one];
        a[one] = a[two];
        a[two] = temp;
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
