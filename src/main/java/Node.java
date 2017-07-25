/**
 * Created by User on 24.07.2017.
 */
public class Node {

    private Node[] childs;//next
    private Object value;

    public Node() {
        this.childs = new Node[256];
    }

    public Node[] getChilds() {
        return childs;
    }

    public void setChilds(Node[] childs) {
        this.childs = childs;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
