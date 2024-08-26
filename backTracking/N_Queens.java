public class N_Queens {
    public static void main(String[] args) {
        boolean[][] board = { { false, false, false },
                { false, false, false },
                { false, false, false }, };
        // nQueens(board, row);
        display(board);
    }

    static int nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        return 0;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}