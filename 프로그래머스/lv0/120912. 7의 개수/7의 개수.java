class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for (int x : array) {
            str += Integer.toString(x);
        }
        String[] findSeven = str.split("");
        for (String s : findSeven) {
            if (s.equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}