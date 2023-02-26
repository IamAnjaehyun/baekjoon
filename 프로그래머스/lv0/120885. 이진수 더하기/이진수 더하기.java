class Solution {
    public String solution(String bin1, String bin2) {
        int bi1,bi2;
        bi1 = Integer.parseInt(bin1,2);
        bi2 = Integer.parseInt(bin2,2);

        return Integer.toBinaryString(bi1+bi2);
    }
}