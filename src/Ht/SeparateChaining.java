/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ht;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class SeparateChaining {

    private Link first;

    public void SortedList() {
        first = null;
    }

    public void insert(Link theLink) {
        int key = 0;
        Link previous = null;
        Link current = first;

        if (theLink.Data.name == null) {
            key = theLink.Data.getNum();
            while (current != null && key > current.Data.getNum()) {
                previous = current;
                current = current.next;
            }

        }
        if (theLink.Data.num == 0 && theLink.Data.name != null) {
            key = theLink.Data.getName().length();

            while (current != null && key > current.Data.name.length()) {
                previous = current;
                current = current.next;
            }

        }

        if (previous == null) {
            first = theLink;
        } else {
            previous.next = theLink;
        }
        theLink.next = current;
    }

    public void delete(int key, int arraySize) {
        if (first == null) {
            JOptionPane.showMessageDialog(null, "List with key [" + key + "] is no there yet ");
            return;
        }
        Link previous = null;
        Link current = first;

        while (current != null && key != current.Data.getNum() % arraySize && key != current.Data.name.length() % arraySize) { // or key == current,
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
    }

    public Link find(int key, int arraySize) {
        Link current = first;

        while (current != null && current.Data.getNum() % arraySize <= key || current.Data.name.length() % arraySize <= key) {

            if (current.Data.getName() != null) {
                if (current.Data.getName().length() % arraySize == key || current.Data.getNum() % arraySize == key) {
                    JOptionPane.showMessageDialog(null, "Found " + current.displayLink());
                    return current;
                }
            }

            if (current.Data.getName() == null) {
                if (current.Data.getNum() % arraySize == key) {
                    JOptionPane.showMessageDialog(null, "Found " + current.displayLink());
                    return current;
                }
            }

            current = current.next;
        }
        JOptionPane.showMessageDialog(null, "Not Found");
        return null;
    }

    String out = "";

    public String displayList() {

        Link current = first;
        while (current != null) {
            out += "-->" + current.displayLink();
            current = current.next;
        }
        out += ("\n");
        return out;
    }

}
