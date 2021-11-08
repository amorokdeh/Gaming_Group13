package common;

import java.util.Arrays;

public class board {
    private String tableName;
    private String[][] board;

    public board(String name) {
        this.board = new String[11][12];
        this.tableName = name;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "-";
            }
        }
        for (int i = 1; i < board.length; i++) {
            board[i][0] = "" + (10 - i);
        }
        board[0][0] = " ";
        board[0][1] = "a";
        board[0][2] = "b";
        board[0][3] = "c";
        board[0][4] = "d";
        board[0][5] = "e";
        board[0][6] = "f";
        board[0][7] = "g";
        board[0][8] = "h";
        board[0][9] = "i";
        board[0][10] = "j";
        board[0][11] = "k";
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return tableName + "\n" + Arrays.toString(board);
    }
}
