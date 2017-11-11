/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Student
 */
public class Dlink {
    
    public Data dData;
    public Dlink next;
    public Dlink prev;
    
   
    public Dlink(Data x){
        dData = x;
    }
    
    
    public String displayLink(){ 
        return  dData.display() ;
    }
}
