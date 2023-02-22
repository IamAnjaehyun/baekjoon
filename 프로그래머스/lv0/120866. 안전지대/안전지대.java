class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        //원 하나 놓고
        //상하좌우대각선 1로변경
        //전체에서 0개수 구하거나
        //전체 - 1의 개수


        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};

        int[][] checkBoard = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (board[i][j] == 1) {checkBoard[i][j] = 1;}
                    if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[nx][ny] == 1) {
                        checkBoard[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < checkBoard.length; i++) {
            for (int j = 0; j < checkBoard.length; j++) {
                if (checkBoard[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}