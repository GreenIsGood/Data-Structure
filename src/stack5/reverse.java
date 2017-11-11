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
import java.util.Stack;
public class reverse {

    String x;

    Stack s;
    public reverse(String h) {

        x = h;
        s=new Stack();
    }


    public void insert(String h) {
        for (int m = 0; m < h.length(); m++) {
            s.push(h.charAt(m));
        }
    }
    String out = "";

    public String display() {
        for (int l = 0; l < x.length(); l++) {
            out += (String.valueOf(s.pop()));
        }
        return out;
    }

}
