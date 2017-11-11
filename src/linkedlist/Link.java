package linkedlist;

/**
 *
 * @author Mahmoud
 */
public class Link {

    public Data Data;

    public Link next;

    public Link(Data d) {
        Data = d;

    }

    public String displayLink() {

        return Data.display();
    }

}
