class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for (int l = i; l <= j; l++) {str += l;}

        String[] arr = str.split("");
        for(String x : arr){if(x.equals(Integer.toString(k))){answer++;}}
        return answer;
    }
}