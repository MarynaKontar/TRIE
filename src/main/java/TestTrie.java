/**
 * Created by User on 25.07.2017.
 */
public class TestTrie {
    public static void main(String[] args) {

        Trie<Integer> trie = new Trie<Integer>();

        for (int i = 6; i<20; i++) {
            String key = "df" + i;
            trie.put(key);
        }
        System.out.println(trie.toString());
    }
}


