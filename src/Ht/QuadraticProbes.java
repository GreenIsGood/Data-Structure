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
public class QuadraticProbes {

    public Data[] hashArray;
    public int arraySize;
    private Data nonItem;

    public QuadraticProbes(int size) {
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
                out += ("-- ");
            }
        }
        return out;
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(Data item) {
        int hashValF = 0;
        int i = 0;
        if (item.name == null) {
            int key = item.getNum();
            hashValF = hashFunc(key);
        }
        if (item.num == 0 && item.name != null) {
            int key = item.getName().length();
            hashValF = hashFunc(key);
        }
        if (item.num != 0 && item.name != null) {
            int key = item.getNum();
            hashValF = hashFunc(key);
        }

        int hashVal = hashValF;

        while (hashArray[hashVal] != null) {

            hashVal = (hashValF + (i * i)) % arraySize;
            i = i + 1;
        }
        hashArray[hashVal] = item;

    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getNum() == key || hashArray[hashVal].getName().length() == key || hashVal == 0) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        JOptionPane.showMessageDialog(null, "can’t find item");
        return null;
    }

    public Data find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getNum() == key || hashArray[hashVal].getName().length() == key || hashVal == 0) {
                JOptionPane.showMessageDialog(null, "Found : " + hashArray[hashVal].display());
                return hashArray[hashVal];
            }
            ++hashVal;
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
