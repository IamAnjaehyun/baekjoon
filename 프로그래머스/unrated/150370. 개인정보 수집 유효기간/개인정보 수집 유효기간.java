import java.util.*;

class Solution {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer= new ArrayList<>();

        int date = getDate(today);

        Map<String, Integer> map = new HashMap<>();
        for(String a : terms){
            String[] aa = a.split(" ");
            map.put(aa[0], Integer.valueOf(aa[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}