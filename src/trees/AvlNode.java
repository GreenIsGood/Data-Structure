/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Mahmoud
 */
public class AvlNode {

    public Data element;

    public AvlNode left;

    public AvlNode right;

    public int height;

    public AvlNode(Data theElement) {
        this(theElement, null, null);
    }

    public AvlNode(Data theElement, AvlNode lt, AvlNode rt) {
        element = theElement;
        left = lt;
        right = rt;
    }
}
