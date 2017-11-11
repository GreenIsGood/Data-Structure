/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class OrderArray  {
    
    
    
    protected Data[] a;
    protected int size;
    public  int arraySize;
    public OrderArray(int index) {
        arraySize=index;
        a= new Data[arraySize];
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public void checkIndex(int index){
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("index "+index+" but size "+size);
    }
    public Object Retrive(int index){
        checkIndex(index);
        return a[index];
    }
    public Data find(Data theElement){
         for (int i = 0; i < size; i++) {
          if ( a[i].equals(theElement)) {
                JOptionPane.showMessageDialog(null, "Found :"+ theElement.display());
                return theElement;
            }
        }
        JOptionPane.showMessageDialog(null, "Not Found");
        return null;
    }
   public Data remove(int index) {
        checkIndex(index);
        Data removed = a[index];
        for (int i = index + 1; i < size; i++) {
            a[i - 1] = a[i];
        }
        a[--size] = null;
        return removed;
    }
    public void insert(Data theElement){
        int i=0;
        if(size==a.length){
            Data [] b=new Data [2*size];
            System.arraycopy(a,0,b,0,size);
            a=b;
        }
        for ( i=0; i <size; i++) {
            if(a[i].compareTo(theElement)>0)
                break;
        }
        for (int j =size-1; j>=i; j--) {
            a[j+1]=a[j];
        }
        a[i]=theElement;
        size++;
    }
    @Override
    public String toString(){
        
        StringBuffer s=new StringBuffer(" ");
        for (int i = 0; i <size; i++) 
            if(a[i]==null)
                s.append("0, ");
            else
                s.append(a[i].display()).append(", ");
        if(size>0)
            s.delete(s.length()-2, s.length());
        
        s.append(" ");
        return new String(s);
    }

    public void clear() {
        a= new Data[arraySize];
        size=0;
    }
    
    
}
