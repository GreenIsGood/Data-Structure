/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ht;

/**
 *
 * @author Mahmoud
 */
public class ScHach {

    public SeparateChaining[] hashArray;
    public int arraySize;

    public ScHach(int size) {
        arraySize = size;
        hashArray = new SeparateChaining[arraySize];
        for (int j = 0; j < arraySize; j++) {
            hashArray[j] = new SeparateChaining();
        }
    }

    String Fout = "";

    public String displayTable() {
        for (int j = 0; j < arraySize; j++) {
            Fout += (j + ". ");
            hashArray[j].displayList();
            Fout += hashArray[j].out;
        }
        return Fout;
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(Link theLink) {
        int hashVal = 0;
        if (theLink.Data.name == null) {
            int key = theLink.Data.getNum();
            hashVal = hashFunc(key);
        }
        if (theLink.Data.num == 0 && theLink.Data.name != null) {
            int key = theLink.Data.getName().length();
            hashVal = hashFunc(key);
        }
        if (theLink.Data.num != 0 && theLink.Data.name != null) {
            int key = theLink.Data.getNum();
            hashVal = hashFunc(key);
        }
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key, arraySize);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key, arraySize);
        return theLink;
    }

    public void clear() {
        hashArray = new SeparateChaining[arraySize];
        for (int j = 0; j < arraySize; j++) {
            hashArray[j] = new SeparateChaining();
        }
    }

}
