
/**
 * Created by User on 24.07.2017.
 */
public class Trie<T> {

    Node root;

    void put(String value) {
        if (value == null) throw new RuntimeException("Key and value cannot be null");
        else root = put(root, value);
    }

    Node put(Node rroot,  String  value) {
        if (rroot == null) rroot = new Node();
        char x;
        for (int i = 0; i < value.length(); i++) {
            if (rroot.value == null) {
                rroot.value = value;
                return rroot;
            }
            x = value.charAt(i);
            rroot.childs[x] = put(rroot.childs[x],  value);
            return rroot;
        }
        return rroot;
    }
    void insert(String key) {
        if (key == null) throw new RuntimeException("Key and value cannot be null");

        if (root == null) root = new Node();
        char x;
        for (int i = 0; i < key.length(); i++) {
            if (root.value == null) {
                root.value = key;
            }
            else {
            x = key.charAt(i);
            root.childs[x] = put(root.childs[x],  key);
            }

        }

    }









    String find(String key) {
        Node node = root;
        if (node == null) return null;//new Exception();
        for (int i = 0; i < key.length(); i++) {
            char x = key.charAt(i);
            Node child = node.childs[x];
            if (child == null) return null;
            else if (child != null)
                node = child;
        }
        return (String) node.value;


    }


    public boolean add(String s) {
        char first = s.charAt(0);
        int index = first;
        if (index < 0) {
            System.out.println("uf");
        }
        Node child = root.childs[index];
        if (child == null) {
            child = new Node();
            root.childs[index] = child;

        }

        return add(s.substring(1));

    }

    @Override
    public String toString() {
        return "Trie{" +
                "root=" + root +
                '}';
    }
}
