/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack5;

public class Stack {

    public int maxSize;
    public Data[] stackArray;
    public int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new Data[maxSize];
        top = -1;
    }

    public void push(Data j) {
        stackArray[++top] = j;
    }

    public Data pop() {
        return stackArray[top--];
    }

    public Data peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void clear() {
        top = -1;
    }
}
