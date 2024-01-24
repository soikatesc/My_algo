package Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    boolean end = false;
    Map<Character, TrieNode> keys = new HashMap<>();
}
