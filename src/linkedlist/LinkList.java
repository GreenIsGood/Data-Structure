package linkedlist;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class LinkList {

    public Link first;

    public void LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(Data id) {
        
        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(Data id) {
        Link newLink = new Link(id);
        Link current = first;

        if (first == null) {
            first = newLink;
        } else {
            while (current.next != null) {
                current = current.next;
            }

            current.next = newLink;
        }
    }
    
   public boolean insertAfter(Data key, Data x){
       Link current = first;

        while (!current.Data.equals(key)) {
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "the one you try to add after it is not here");
                return false;
            }
        }
       Link mylink = new Link(x);
       
       mylink.next=current.next;
       current.next=mylink;
       
       
       return true;
}

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = first;
        if (first.next == null) {
            first = null;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }

        return temp;
    }

    public Link deleteKey(Data key) {
        Link current = first;
        Link prevCurrent = null;
        while (!current.Data.equals(key)) {
            prevCurrent = current;
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "check your key again !");
                return null;
            }
        }

        Link mylink = new Link(key);

        if (current == first) {
            deleteFirst();
        } else if (current.next == null) {
            deleteLast();
        } else {

            prevCurrent.next = prevCurrent.next.next;
            current.next = null;
        }

        return mylink;

    }

    public Link find(Data k) {
        Link current = first;

        while (!current.Data.equals(k)) {
            current = current.next;
            if (current == null) {
                JOptionPane.showMessageDialog(null, "Not found");
                return null;
            }
        }
        JOptionPane.showMessageDialog(null, "Found : " + current.displayLink());
        return current;
    }

    public void clear() {
        first = null;
    }
}
