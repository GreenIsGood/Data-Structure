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
public class Me {

    public Data[] a;

    public int size;

    public int arraySize;

    public Me(int length) {
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

    public void mergeSort() {
        if (isEmpty()){}
        if (!isEmpty()){
        Data[] workSpace = new Data[size];
        recMergeSort(workSpace, 0, size - 1);
        }
    }

    private void recMergeSort(Data[] workSpace, int lowerBound,int upperBound) {
        if (lowerBound == upperBound) {
        } else {
            int mid = (lowerBound + upperBound) / 2;

            recMergeSort(workSpace, lowerBound, mid);

            recMergeSort(workSpace, mid + 1, upperBound);

            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(Data[] workSpace, int lowPtr,
            int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        while (lowPtr <= mid && highPtr <= upperBound) {
            if (a[lowPtr].compareTo(a[highPtr]) < 0) {
                workSpace[j++] = a[lowPtr++];
            } else {
                workSpace[j++] = a[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workSpace[j++] = a[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workSpace[j++] = a[highPtr++];
        }
        for (j = 0; j < n; j++) {
            a[lowerBound + j] = workSpace[j];
        }
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
