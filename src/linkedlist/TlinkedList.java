/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Mahmoud
 */
public class TlinkedList {

    public Tlink first;
    public Tlink last;
    public Tlink above;
    public Tlink below;

    public TlinkedList() {
        first = null;
        last = null;
        above = null;
        below = null;
    }

    public void insertRow(Object T) {
        Tlink newLink = new Tlink(T);
        newLink.next = first;
        first = newLink;
    }

    public void insertColumn(Object T) {
        Tlink newLink = new Tlink(T);
        newLink.down = first.down;
        first.down = newLink;
    }

    public void display() {
        Tlink current = first;
        while (current != null) {
            System.out.print(current.Displaylink() + "  ");
            current = current.next;
        }
        System.out.println("");
        while (current != null) {
            System.out.println(current.Displaylink() + "  ");
            current = current.down;
        }
    }
    
    
}



