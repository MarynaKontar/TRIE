/**
 * Created by User on 25.07.2017.
 */
public class Trie2<Value> {

    Node root;

    void put(String key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        else root = put(root, key, val, 0);
    }

    private Node put(Node rrot, String key, Value val, int d) {
        if (rrot == null) rrot = new Node();
        if (d == key.length()) {
            rrot.value = val;
            return rrot;
        }
        char c = key.charAt(d);
        rrot.childs[c] = put(rrot.childs[c], key, val, d + 1);
        return rrot;
    }

    @Override
    public String toString() {
        return "Trie2{" +
                "root=" + root +"\n"+
                '}';
    }

    public static void main(String[] args) {
        Trie2<String> trie = new Trie2<String>();
        for (int i = 0; i < 20; i++) {
            String key = "df" + i;
            trie.put(key, "" + i);
        }
        System.out.println(trie.toString());
    }
}

