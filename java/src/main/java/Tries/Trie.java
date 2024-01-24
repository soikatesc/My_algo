package Tries;

public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        insertHelpher(word, this.root);
    }

    public void insertHelpher(String word, TrieNode node) {
        if (word.length() == 0) {
            node.end = true;
        }else if (!node.keys.containsKey(word.charAt(0))) {
            node.keys.put(word.charAt(0), new TrieNode());
            TrieNode n = node.keys.get(word.charAt(0));
            this.insertHelpher(word.substring(1), n);
        } else {
            this.insertHelpher(word.substring(1), node.keys.get(word.charAt(0)));
        }
    }

    public boolean search(String word) {
        return searchHelpher(word, this.root);
    }

    public boolean searchHelpher(String word, TrieNode node) {
        if (word.length() == 0 && node.end) return true;
        else if (word.length() == 0) return false;
        else if (!node.keys.containsKey(word.charAt(0))) {
            return false;
        } else {
            return this.searchHelpher(word.substring(1), node.keys.get(word.charAt(0)));
        }
    }

    public boolean startsWith(String prefix) {
        return this.startsWithDfs(prefix, this.root);
    }

    public boolean startsWithDfs(String prefix, TrieNode node) {
        if (prefix.length() == 0) return  true;
        else if (!node.keys.containsKey(prefix.charAt(0))) {
            return false;
        } else {
            return startsWithDfs(prefix.substring(1), node.keys.get(prefix.charAt(0)));
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
    }
}
