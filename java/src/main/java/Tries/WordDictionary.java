package Tries;

public class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        this.addWorkDfs(word, this.root);
    }

    public void addWorkDfs(String word, TrieNode node) {
        if (word.length() == 0) {
            node.end = true;
        } else if (!node.keys.containsKey(word.charAt(0))) {
            node.keys.put(word.charAt(0), new TrieNode());
            addWorkDfs(word.substring(1), node.keys.get(word.charAt(0)));
        } else {
            addWorkDfs(word.substring(1), node.keys.get(word.charAt(0)));
        }
    }

    public boolean search(String word) {
        return searchDfs(word, 0, this.root);
    }

    public boolean searchDfs(String word, int idx, TrieNode node) {
        for (int i = idx; i < word.length(); i++) {
            Character c = word.charAt(i);

            if (c == '.') {
                for (TrieNode child: node.keys.values()) {
                    if (node != null && searchDfs(word, i + 1, child)) return true;
                }
                return false;
            } else {
                if (!node.keys.containsKey(c)) {
                    return false;
                }
                node = node.keys.get(c);
            }
        }

        return node.end;
    }

//    public boolean searchDfs(String word, TrieNode node) {
//        if (node == null) return false;
//        else if (word.length() == 0 && node.end) return true;
//        else if (word.length() == 0) return false;
//        else if (node != null && word.charAt(0) == '.') {
//            for (TrieNode child: node.keys.values()) {
//                return searchDfs(word.substring(1), child);
//            }
//        } else if (!node.keys.containsKey(word.charAt(0))) {
//            return false;
//        }
//        return searchDfs(word.substring(1), node.keys.get(word.charAt(0)));
//    }

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");
//        System.out.println(wordDictionary.search("."));
//        System.out.println(wordDictionary.search("a"));
//        System.out.println(wordDictionary.search("aa"));
//        System.out.println(wordDictionary.search("a"));
//        System.out.println(wordDictionary.search(".a"));
//        System.out.println(wordDictionary.search("a"));
//        System.out.println(wordDictionary.search(".at"));
        wordDictionary.addWord("bat");
        System.out.println(wordDictionary.search(".at"));
//        System.out.println(wordDictionary.search("an."));
//        System.out.println(wordDictionary.search("a.d."));
//        System.out.println(wordDictionary.search("b."));
//        System.out.println(wordDictionary.search("a.d"));
//        System.out.println(wordDictionary.search("."));
    }
}
