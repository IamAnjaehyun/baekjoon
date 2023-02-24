class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        for (int i=0;i<babbling.length;i++) {
            babbling[i] = babbling[i].replace(speak[0],"1");
            babbling[i] = babbling[i].replace(speak[1],"1");
            babbling[i] = babbling[i].replace(speak[2],"1");
            babbling[i] = babbling[i].replace(speak[3],"1");
            babbling[i] = babbling[i].replace("1","");
            // System.out.println(babbling[i] + "   ba[i]");
            if(babbling[i].equals("")) {answer++;}
        }
        return answer;
    }
}