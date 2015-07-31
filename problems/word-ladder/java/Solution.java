import java.util.*;
public class Solution {
    static class Node {
        String word;
        int len;
        Node(String word, int len) {
            this.word = word;
            this.len = len;
        }
    }
    public int ladderLength(String start, String end, Set<String> dict) {
        if (transformable(start, end)) {
            return 2;
        }
        LinkedList<Node> queue = new LinkedList<Node>();
        List<String> words = new ArrayList<String>(dict);
        boolean[] vis = new boolean[dict.size()];
        queue.offer(new Node(start, 1));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0 ; i < words.size(); i++) {
                String word = words.get(i);
                if (!vis[i] && transformable(node.word, word)) {
                    if (transformable(word, end)) {
                        return node.len + 2;
                    }
                    queue.offer(new Node(word, node.len + 1));
                    vis[i] = true;
                }
            }
        }
        return 0;
    }
    boolean transformable(String word1, String word2) {
        int cnt = 0;
        for (int i = 0; i < word1.length() && i < word2.length() && cnt <= 1; i++) {
            cnt += word1.charAt(i) != word2.charAt(i) ? 1 : 0;
        }
        return word1.length() == word2.length() && cnt == 1;
    }
}
