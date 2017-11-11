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

public class Iop {

    public Stack s;
    public String input;
    public String output = "";


    public Iop(String in) 
    {
        input = in;
        
        s = new Stack();
    }

    public String doTrans() 
    {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            switch (ch) {
                case '+': 
                case '-':
                    gotOper(ch, 1); 
                    break; 
                case '*':
                case '/':
                    gotOper(ch, 2); 
                    break; 
                case '(': 
                    s.push(ch); 
                    break;
                case ')': 
                    gotParen(ch); 
                    break;
                default: 
                    output = output + ch; 
                    break;
            } 
        }
        while (!s.isEmpty()) 
        {

            output = output + s.pop(); 
        }

        return output; 
    } 


    public void gotOper(char opThis, int prec1) { 
        while (!s.isEmpty()) {
            char opTop = (char) s.pop();
            if (opTop == '(') 
            {
                s.push(opTop); 
                break;
            } else 
            {
                int prec2; 
                if (opTop == '+' || opTop == '-') 
                {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) 
                { 
                    s.push(opTop); 
                    break;
                } else 
                {
                    output = output + opTop; 
                }
            } 
        } 
        s.push(opThis); 
    } 


    public void gotParen(char ch) { 
        while (!s.isEmpty()) {
            char chx = (char) s.pop();
            if (chx == '(') 
            {
                break; 
            } else 
            {
                output = output + chx; 
            }
        } 
    } 

}
