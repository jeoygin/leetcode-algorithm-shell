import java.util.*;
public class Solution {
    List<List<String>> res;
    Map<String, List<String>> map;
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        Queue<String> queue = new ArrayDeque<String>();
        Map<String, Integer> ladder = new HashMap<String, Integer>();
        map = new HashMap<String, List<String>>();
        int min = Integer.MAX_VALUE;
        queue.offer(start);
        for (String word: dict) {
            ladder.put(word, Integer.MAX_VALUE);
        }
        ladder.put(start, 0);
        ladder.put(end, Integer.MAX_VALUE);
        while (!queue.isEmpty()) {
            String word = queue.poll();
            int step = ladder.get(word) + 1;
            if (step > min) {
                break;
            }
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String newWord = new String(chars);
                    if (ladder.containsKey(newWord) || newWord.equals(end)) {
                        if (step > ladder.get(newWord)) {
                            continue;
                        } else if (step < ladder.get(newWord)) {
                            ladder.put(newWord, step);
                            queue.offer(newWord);
                        }

                        if (map.containsKey(newWord)) {
                            map.get(newWord).add(word);
                        } else {
                            List<String> list = new ArrayList<String>();
                            list.add(word);
                            map.put(newWord, list);
                        }

                        if (newWord.equals(end)) {
                            min = step;
                        }
                    }
                }
                chars[i] = word.charAt(i);
            }
        }
        res = new ArrayList<List<String>>();
        if (min != Integer.MAX_VALUE) {
            search(end, start, new LinkedList<String>());
        }
        return res;
    }
    void search(String word, String start, LinkedList<String> aux) {
        if (word.equals(start)) {
            aux.addFirst(start);
            res.add(new ArrayList<String>(aux));
            aux.removeFirst();
            return;
        }
        aux.addFirst(word);
        if (map.containsKey(word)) {
            for (String w : map.get(word)) {
                search(w, start, aux);
            }
        }
        aux.removeFirst();
    }
}
