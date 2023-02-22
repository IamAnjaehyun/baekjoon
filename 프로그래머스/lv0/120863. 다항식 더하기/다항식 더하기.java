class Solution {
    public String solution(String polynomial) {
        int sumX = 0;
        int sum = 0;
        for (String s : polynomial.split(" ")) {
            if (s.equals("+")) continue;

            if (s.contains("x")) {
                sumX += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else{
                sum += Integer.parseInt(s);
            }
        }
        if (sumX != 0 && sum != 0) {
            return sumX == 1 ? ("x + "+sum) :  (sumX + "x + "+sum);
        }
        if (sumX != 0) return sumX == 1 ? "x" : sumX+"x";
        return sum != 0 ? sum+"" : "0";
    }
}