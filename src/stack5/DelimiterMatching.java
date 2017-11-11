/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack5;


import java.util.Stack;

public class DelimiterMatching {

    String out = "";

    public boolean isTrue(String s) {

        int m = s.length();

        String c = "";
        for (int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == ']' || ch == '{' || ch == '}' || ch == '(' || ch == ')') {
                c += ch;
            }
        }

        m = c.length();
        Stack x;
        x = new Stack();

        for (int i = 0; i < m; i++) {

            char ch = c.charAt(i);

            if (x.isEmpty()) {
                x.push(ch);
            } else if (ch == ']') {
                if (x.peek().equals('[')) {
                    x.pop();
                } else {
                     out = "not correct" + " ' " + x.peek() + " ' " + "dosen't match"+" ' "+ch+" ' ";
                    return false;
                }
            } else if (ch == '}') {
                if (x.peek().equals('{')) {
                    x.pop();
                } else {
                     out = "not correct" + " ' " + x.peek() + " ' " + "dosen't match"+" ' "+ch+" ' ";
                    return false;
                }
            } else if (ch == ')') {
                if (x.peek().equals('(')) {
                    x.pop();
                } else {
                     out = "not correct" + " ' " + x.peek() + " ' " + "dosen't match"+" ' "+ch+" ' ";
                    return false;
                }
            } else {
                x.push(ch);
            }
        }
        if(!x.isEmpty()){
            out = "not correct" + " ' " + x.peek() + " ' " + "nothing match";
                    return false;
        }
       
        out = "correct";
        return true;

    }

}
