import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    static boolean isWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] != 'X' && board[i][j] != 'O')
                    return false;
        return true;
    }

    static void resetBoard() {
        char count = '1';
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean playAgain = true;

        while (playAgain) {
            resetBoard();
            boolean gameOver = false;

            while (!gameOver) {
                printBoard();
                System.out.print("Player " + currentPlayer + ", enter position (1-9): ");
                int pos = sc.nextInt();

                boolean valid = false;

                for (int i = 0; i < 3 && !valid; i++)
                    for (int j = 0; j < 3; j++)
                        if (board[i][j] == (char)(pos + '0')) {
                            board[i][j] = currentPlayer;
                            valid = true;
                        }

                if (!valid) {
                    System.out.println("Invalid Move! Try again.");
                    continue;
                }

                if (isWinner(currentPlayer)) {
                    printBoard();
                    System.out.println("🎉 Player " + currentPlayer + " wins!");
                    gameOver = true;
                }
                else if (isBoardFull()) {
                    printBoard();
                    System.out.println("😐 Game Draw!");
                    gameOver = true;
                }
                else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }
}
