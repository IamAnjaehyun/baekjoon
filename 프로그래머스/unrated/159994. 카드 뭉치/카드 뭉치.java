class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < goal.length) {
            if (i < cards1.length && cards1[i].equals(goal[k])) {
                i++;
                k++;
            } else if (j < cards2.length && cards2[j].equals(goal[k])) {
                j++;
                k++;
            } else{
                return "No";
            }
        }
        // System.out.println(i + " " + j + " " + k);
        return k == goal.length ? "Yes" : "No";
    }
}