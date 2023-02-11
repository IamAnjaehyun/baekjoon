class Solution {
    public int solution(int n) {
        //한판에 6조각
        int pizza = 6;
        while (pizza % n != 0) {
            pizza+=6;
        }

        return pizza/6;
    }
}