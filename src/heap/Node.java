/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Mahmoud
 */
public class Node {

    private Data data; 


    public Node(Data key) 
    {
        data = key;
    }

    public Data getKey() {
        return data;
    }

    public void setKey(Data id) {
        data = id;
    }

}
