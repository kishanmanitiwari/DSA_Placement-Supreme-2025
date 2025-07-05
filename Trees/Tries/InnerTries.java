package Trees.Tries;
class TrieNode {
    TrieNode[] letter = new TrieNode[26]; // 26 for each alphabet letter
    boolean isEndOfWord = false;

}

class Tries {
    private TrieNode root;

    Tries() {
        root = new TrieNode();
    }

    // insert
    public void insert(String str) {
        // cap ///cat
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int characterIndex = ch - 'a';

            // present or not present
            if (node.letter[characterIndex] == null) {
                // not present insert freely
                node.letter[characterIndex] = new TrieNode();
            }
            node = node.letter[characterIndex];
        }

        node.isEndOfWord = true;
    }

    // serach
    boolean serach(String str) {
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int characterIndex = ch - 'a';

            // present or not present
            if (node.letter[characterIndex] == null) {
                return false;
            }
            node = node.letter[characterIndex];
        }

        return node.isEndOfWord;
    }

    // checkif Starts with prefic
    boolean prefixStart(String str) {
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int characterIndex = ch - 'a';

            // present or not present
            if (node.letter[characterIndex] == null) {
                return false;
            }
            node = node.letter[characterIndex];
        }

        return true;
    }
}

public class InnerTries {
    public static void main(String[] args) {
        Tries mytrie = new Tries();
        mytrie.insert("cat");
        mytrie.insert("cap");
        mytrie.insert("can");
        mytrie.insert("capable");

        System.out.println("The given word is " + mytrie.serach("cat")); //true

        System.out.println(mytrie.prefixStart("capa")); //true
    }

}