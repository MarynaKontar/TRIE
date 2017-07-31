import java.util.Arrays;

/**
 * Created by User on 24.07.2017.
 */
public class Node {

    Node[] childs = new Node[256];
    Object value;

//    public Node() {
//        this.childs = new Node[256];
//    }
//
//    public Node(Node[] childs, Object value) {
//        this.childs = childs;
//        this.value = value;
//    }
//
//    public Node[] getChilds() {
//        return childs;
//    }
//
//    public void setChilds(Node[] childs) {
//        this.childs = childs;
//    }
//
//    public Object getValue() {
//        return value;
//    }
//
//    public void setValue(Object value) {
//        this.value = value;
//    }


    @Override
    public String toString() {
        return "Node{" +
                "childs=" + Arrays.toString(childs)+"\n" +
                ", value=" + value+"\n" +
                '}';
    }

}
