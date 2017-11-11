/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Mahmoud
 */
public class Tlink {
    public Object Data;
    public Tlink next;
    public Tlink prev;
    public Tlink up;
    public Tlink down;
     
    public Tlink( Object T){
    Data=T;
    }
    
    public String Displaylink(){
        return "["+ Data+"]";
    
    }
}
