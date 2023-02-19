class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int left = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("-")) {
                    left -= Integer.parseInt(arr[j + 1]);
                    j++;
                } else if (arr[j].equals("+")) {
                    j++;
                    left += Integer.parseInt(arr[j]);
                } else if (arr[j].equals("=")) {
                    if(left == Integer.parseInt(arr[j+1])){
                        answer[i] = "O";
                    }else {
                        answer[i] = "X";
                    }
                } else {
                    left += Integer.parseInt(arr[j]);
                }
            }

        }
        return answer;
    }
}