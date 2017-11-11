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
public class Qu {

    protected Data[] a;
    protected int size;
    public int arraySize;

    public Qu(int length) {
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

    public void quickSort() {
        recQuickSort(0, size - 1);
    }

    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
        } else {
            Data pivot = a[right];

            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    @SuppressWarnings("empty-statement")
    public int partitionIt(int left, int right, Data pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (a[++leftPtr].compareTo(pivot) < 0);

            while (rightPtr > 0 && a[--rightPtr].compareTo(pivot) > 0);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int x, int y) {
        Data temp = a[x];
        a[x] = a[y];
        a[y] = temp;
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
