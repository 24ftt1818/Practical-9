import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        while (true) {
            printBoard(board);
            System.out.println("Player's turn");
            System.out.print("Enter a row (0 , 1 or 2): ");
            int r = input.nextInt();
            System.out.print("Enter a column (0 , 1 or 2): ");
            int c = input.nextInt();

            if (r<0 || r>2 || c<0 || c>2 || board[r][c] != ' ') continue;
            board[r][c] = 'X';

            if (win(board,'X')) { System.out.println("\nGame ended, Player Win"); printBoard(board);
            break; }

            if (full(board))   { System.out.println("\nGame ended, Draw");        
            printBoard(board); 
            break; }

            int cr = -1, cc = -1;
            outer:
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] == ' ') { cr = i; cc = j; break outer; }
            board[cr][cc] = 'O';
            if (win(board,'O')) { System.out.println("\nGame ended, CPU Win"); printBoard(board); 
            break; }
        }

    }
    static void printBoard(char[][] b) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + b[i][0] + " | " + b[i][1] + " | " + b[i][2]);
            if (i < 2) System.out.println("---------");
        }
        System.out.println();

    }
    static boolean win(char[][] b, char p) {
        for (int i = 0; i < 3; i++) if (b[i][0] == p && b[i][1] == p && b[i][2] ==p) return true;
        for (int j = 0; j < 3; j++) if (b[0][j] == p && b[1][j] == p && b[2][j] ==p) return true;
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p) return true;
        if (b[0][2] == p && b[1][1] == p && b[2][0] ==p ) return true;
        return false;

    }
    static boolean full(char[][] b) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (b[i][j] == ' ') return false;
        return true;
    }
}