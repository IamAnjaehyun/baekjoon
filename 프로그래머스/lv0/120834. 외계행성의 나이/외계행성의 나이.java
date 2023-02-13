class Solution {
    public String solution(int age) {
        String answer = "";

        String changeInt = Integer.toString(age);
        for (int i = 0; i < changeInt.length(); i++) {
            answer+= (char) (changeInt.charAt(i)+49);
        }

        return answer;
    }
}