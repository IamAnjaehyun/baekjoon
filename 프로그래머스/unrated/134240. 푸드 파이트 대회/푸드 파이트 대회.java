class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                left.append(i);
                right.insert(0, i);
            }
        }
        answer = String.valueOf(left.append(0).append(right));
        return answer;
    }
}