package gr.aueb.cf.Projects;

import java.util.Scanner;

public class Project04 {

    public static void main(String[] args) {

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}}; // 3x3 board.
        char currentPlayer = 'X'; // First player starts with 'X'.
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);


            System.out.println("Player " + currentPlayer + ", please enter your move(row and column between 1 & 3).");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            // Validate the move: check if it's within bounds and the cell is empty.
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;

                // Check for win.
                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " win!");
                    gameOver = true;
                }
                // Check for a draw.
                else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                }
                // Switch players.
                else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move.Please try again.");
            }
        }
        scanner.close();
    }
    // Print board.
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
            if (i < 2) {
                System.out.println("-------------");
            }
        }
    }

    private static boolean checkWin(char[][] board, char player) {
        // Check conditions.
        for (int i = 0; i < 3; i++) {
            //Row Check.
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            //Column Check.
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
           //Diagonals Check.
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;// No win.
    }

    //Check if the board is full.
    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}