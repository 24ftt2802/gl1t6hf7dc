import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        boolean gameOver = false;
        char currentPlayer = 'X'; 
        
        while (!gameOver) {
            printBoard(board);
            
            if (currentPlayer == 'X') {
                System.out.println("Player's turn");
                System.out.print("Enter a row (0,1 or 2): ");
                int row = input.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                int col = input.nextInt();
                
                if (board[row][col] == ' ') {
                    board[row][col] = 'X';
                } else {
                    System.out.println("Cell already occupied! Try again.");
                    continue;
                }
            } else {
                System.out.println("Computer's turn");
                int row, col;
                do {
                    row = (int)(Math.random() * 3);
                    col = (int)(Math.random() * 3);
                } while (board[row][col] != ' ');
                
                board[row][col] = 'O';
                System.out.println("Computer chose: " + row + ", " + col);
            }
            
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                String winner = (currentPlayer == 'X') ? "Player" : "CPU";
                System.out.println("Game ended, " + winner + " Win");
                gameOver = true;
            }
            
            if (isBoardFull(board) && !gameOver) {
                printBoard(board);
                System.out.println("Game ended, It's a draw!");
                gameOver = true;
            }
            
            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    
    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }
    
    public static boolean checkWin(char[][] board, char player) {
    
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        
        return false;
    }
    
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}