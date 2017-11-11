/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import javax.swing.JOptionPane;


public class Dlinkedlist {

    public Dlink first;
    public Dlink last;
    public int nItems;

    public Dlinkedlist() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Data x) {

        nItems++;
        Dlink mylist = new Dlink(x);

        if (isEmpty()) {
            last = mylist;
        } else {
            first.prev = mylist;
        }
        mylist.next = first;
        first = mylist;
    }

    public void insertLast(Data x) {

        nItems++;
        Dlink mylist = new Dlink(x);

        if (isEmpty()) {
            first = mylist;
        } else {
            last.next = mylist;
        }
        mylist.prev = last;
        last = mylist;
    }

    public boolean insertAfter(Data key, Data x) {

        nItems++;
        Dlink current = first;

        while (!current.dData.equals(key)) {
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "the one you try to add after it is not here");
                return false;
            }
        }

        Dlink mylink = new Dlink(x);

        if (current == last) {
            mylink.next = null;
            last = mylink;
        } else {
            mylink.next = current.next;
            current.next.prev = mylink;
        }

        mylink.prev = current;
        current.next = mylink;

        return true;
    }

    public Dlink deleteFirst() {

        nItems--;
        Dlink temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }

        first = first.next;

        return temp;
    }

    public Dlink deleteLast() {

        nItems--;
        Dlink temp = last;

        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }

        last = last.prev;

        return temp;
    }

    public Dlink deleteKey(Data key) {

        nItems--;
        Dlink current = first;
        while (!current.dData.equals(key)) {
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "check your key again !");
                return null;
            }
        }

        Dlink mylink = new Dlink(key);

        if (current == first) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }

        if (current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        return mylink;
    }

    public Dlink find (Data k){
        Dlink current = first;
        
        while (!current.dData.equals(k)) {
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "Not found");
                return null;
            }
        }
        JOptionPane.showMessageDialog(null, "Found : "+ current.displayLink());
        return current;
}
   
    public int size() {
        return nItems;
    }

    public void clear() {
        first = null;
        last = null;
    }
}
