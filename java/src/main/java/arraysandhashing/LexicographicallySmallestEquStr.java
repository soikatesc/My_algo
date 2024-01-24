package arraysandhashing;

public class LexicographicallySmallestEquStr {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            uf.union(c1, c2);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            sb.append((char) ('a' + uf.find(c)));
        }

        return sb.toString();
    }

    class UnionFind {
        int[] ids;

        public UnionFind() {
            ids = new int[26];
            for (int i = 0; i < 26; i++) {
                ids[i] = i;
            }
        }

        public void union(char a, char b) {
            int x = find(a);
            int y = find(b);

            if (x < y) {
                ids[y] = x;
            } else {
                ids[x] = y;
            }
        }

        public int find(char x) {
            while (x - 'a' != ids[x - 'a']) {
                ids[x - 'a'] = ids[ids[x - 'a']];
                x = (char) (ids[x - 'a'] + 'a');
            }
            return x - 'a';
        }
    }

    public static void main(String[] args) {
        LexicographicallySmallestEquStr obj = new LexicographicallySmallestEquStr();
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        obj.smallestEquivalentString(s1, s2, baseStr);
    }
}
