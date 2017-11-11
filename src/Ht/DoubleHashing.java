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
public class DoubleHashing {

    public Data[] hashArray;
    public int arraySize;
    public Data nonItem;

    DoubleHashing(int size) {
        arraySize = size;
        hashArray = new Data[arraySize];
        nonItem = new Data(-1);
    }

    String out = "";

    public String displayTable() {

        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                if (hashArray[j].name == null) {
                    out += (hashArray[j].num + " ");
                }
                if (hashArray[j].num == 0 && hashArray[j].name != null) {
                    out += (hashArray[j].name + " ");
                }
                if (hashArray[j].num != 0 && hashArray[j].name != null) {
                    out += (hashArray[j].num + " " + hashArray[j].name + " ");
                }

            } else {
                out += ("__ ");
            }
        }
        return out;
    }

    public int hashFunc1(int key) {
        return key % arraySize;
    }

    public int hashFunc2(int key) {

        return 5 - (key % 5);
    }

    public void insert(int key, Data item) {
        int hashVal = 0;
        int stepSize = 0;
        if (item.name == null) {

            hashVal = hashFunc1(key);
            stepSize = hashFunc2(key);
        }
        if (item.num == 0 && item.name != null) {

            hashVal = hashFunc1(key);
            stepSize = hashFunc2(key);
        }
        if (item.num != 0 && item.name != null) {

            hashVal = hashFunc1(key);
            stepSize = hashFunc2(key);
        }
        int positionsChecked = 1;

        while (hashArray[hashVal] != null) {
            if (positionsChecked == hashArray.length) {
                JOptionPane.showMessageDialog(null, "can't do it");
                return;
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hashFunc1(key);
        int stepSize = hashFunc2(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getNum() == key || hashArray[hashVal].getName().length() == key || hashVal == 0) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        return null;
    }

    public Data find(int key) {
        int hashVal = hashFunc1(key);
        int stepSize = hashFunc2(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getNum() == key || hashArray[hashVal].getName().length() == key || hashVal == 0) {
                JOptionPane.showMessageDialog(null, "Found : " + hashArray[hashVal].display());
                return hashArray[hashVal];
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        JOptionPane.showMessageDialog(null, "Not Found");
        return null;
    }

    public void clear() {
        for (int i = 0; i < hashArray.length; i++) {
            hashArray[i] = null;
        }
    }
}
