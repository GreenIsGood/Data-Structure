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
public class Node {
   
    Data value;
    Node left;
    Node right;

    
    public Node(Data data){
        this.value=data;
        
    }

    public Node(Data data, Node left, Node Right) {
        this.value = data;
     
        this.left = left;
        this.right = Right;
    }
    
    public String displayNode(){
        return value.display();
    }
}
