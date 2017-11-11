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

public class ParsePost {

    private Stack s;
    private String input;


    public ParsePost(String s) {
        input = s;
    }


    public String doParse() {
        s = new Stack(); 
        char ch;
        int j;
        int num1, num2, interAns;
        for (j = 0; j < input.length(); j++) 
        {
            ch = input.charAt(j); 
            if (ch >= '0' && ch <= '9') 
            {
                s.push((int) (ch - '0')); 
            } else 
            {
                num2 = (int) s.pop(); 
                num1 = (int) s.pop();
                switch (ch) 
                {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;

                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                } 
                s.push(interAns); 
            }
        } 
        interAns = (int) s.pop(); 
        return interAns + "";
    } 
}
