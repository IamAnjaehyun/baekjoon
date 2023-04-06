import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            int j = map.get(callings[i]);
            if (j > 0) {
                String temp = players[j-1];
                players[j-1] = players[j];
                players[j] = temp;
                map.put(players[j-1], j-1);
                map.put(players[j], j);
            }
        }
        return players;
    }
}