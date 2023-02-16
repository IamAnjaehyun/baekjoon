class Solution {
    public String solution(String my_string) {
//         String answer = "";
//         char[] ans = new char[my_string.length()];

//         for (int i = 0; i < my_string.length(); i++) {
//             ans[i] = my_string.charAt(i);
//         }

//         for (char s : ans) {
//             if (s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u') {
//                 answer += s;
//             }
//         }
//         return answer;
        return my_string.replaceAll("[aeiou]", "");
    }
}