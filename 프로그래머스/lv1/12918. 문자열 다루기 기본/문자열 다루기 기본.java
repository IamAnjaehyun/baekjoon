class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] cArr = s.toCharArray();
        if(s.length() == 4 || s.length() ==6){
            for(char a : cArr){
            if(a > '9'){
                return false;
            }
            }
        }else{
                return false;
            }
        
        
        

        return true;
    }
}