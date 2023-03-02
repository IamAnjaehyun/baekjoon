class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pLen = 0;
        int yLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {pLen++;}
            else if (s.charAt(i) == 'y') {yLen++;}
        }
        if(pLen != yLen){answer = false;}

        return answer;
    }
}