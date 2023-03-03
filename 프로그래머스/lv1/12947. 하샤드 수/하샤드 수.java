class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] s = String.valueOf(x).split("");
        int sSum = 0;
        for(String a : s){sSum += Integer.parseInt(a);}
        if(x % sSum != 0){return false;}
        return answer;
    }
}