/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack5;

/**
 *
 * @author Mahmoud
 */
public class Data {

    public int num;
    public String name;

    public Data(int l) {
        num = l;
    }

    public Data(String s) {
        name = s;
    }

    public Data(String s, int l) {
        num = l;
        name = s;
    }

    public String display() {
        if (name == null) {
            return "[" + num + "]";
        }
        if (num == 0) {
            return "[" + name + "]";
        } else {
            return "[" + num + "  " + name + "]";
        }
    }
}
