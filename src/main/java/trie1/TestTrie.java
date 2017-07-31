package trie1;


/**
 * Created by User on 25.07.2017.
 */
public class TestTrie{
        public static void main(String[] args) {
            Trie trie = new Trie();
            TrieContainer start = new TrieContainer();
            trie.storeWords(start, "hello");
            trie.storeWords(start, "hallo");
            trie.storeWords(start, "hell");
            trie.storeWords(start, "teg");
            trie.storeWords(start, "tag");
            trie.printWordStrings(start,"");
            System.out.println("\n"+trie.isWordPresent(start, "teg"));
        }
}
