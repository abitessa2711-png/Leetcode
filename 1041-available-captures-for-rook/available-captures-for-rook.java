class Solution {
    public int numRookCaptures(char[][] board) {

        int row = 0;
        int col = 0;

        // Find R
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                }
            }
        }

        int count = 0;

        // UP
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'B')
                break;
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }

        // DOWN
        for (int i = row + 1; i < 8; i++) {
            if (board[i][col] == 'B')
                break;
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }

        // LEFT
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'B')
                break;
            if (board[row][j] == 'p') {
                count++;
                break;
            }
        }

        // RIGHT
        for (int j = col + 1; j < 8; j++) {
            if (board[row][j] == 'B')
                break;
            if (board[row][j] == 'p') {
                count++;
                break;
            }
        }

        return count;
    }
}