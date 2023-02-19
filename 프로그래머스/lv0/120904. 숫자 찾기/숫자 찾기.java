class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String[] numArr = str.split("");
        for (int i = 0; i < numArr.length; i++) {
            if (Integer.parseInt(numArr[i]) == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}