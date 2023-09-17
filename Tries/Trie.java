public class Trie {
    static Node root;

    Trie() {
        root = new Node();
    }
    // insert a word in tries;

    public static void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public static boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return false;
            }
            node = node.get(word.charAt(i));
        }
        if (node.isEnd()) {
            return true;
        }
        return false;
    }

    public static boolean startsWith(String prefix) {
        Node node = root;
        for(int i=0; i<prefix.length();i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        int type[] = { 1, 1, 2, 3, 2 };
        String value[] = { "hello", "help", "help", "hel", "hel" };
        
        for (int i = 0; i < n; i++) {
            if (type[i] == 1) {
                insert(value[i]);
            } else if (type[i] == 2) {
                if (search(value[i])) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                if (startsWith(value[i])) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
}
