
/**
 * Created by User on 24.07.2017.
 */
public class Trie<T> {

    Node root;

    void put(String key, T value) {
        if (key == null || value == null) throw new RuntimeException("Key and value cannot be null");
        else root = put(root, key, value);
    }

    Node put(Node rroot, String key, T value) {
        if (rroot == null) rroot = new Node();
        char x;
        for (int i = 0; i < key.length(); i++) {
            if (rroot.value == null) {
                rroot.value = value;
                return rroot;
            }
            x = key.charAt(i);
            rroot.childs[x] = put(rroot.childs[x], key, value);
            return rroot;
        }
        return rroot;
    }


    String find(String key) {
        Node node = root;
        if (node == null) return null;//new Exception();
        for (int i = 0; i < key.length(); i++) {
            char x = key.charAt(i);
            Node child = node.childs[x];
            if (child != null)
                node = child;
        }
        return (String) node.value;


    }

    @Override
    public String toString() {
        return "Trie{" +
                "root=" + root +
                '}';
    }
}
