import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //Welcome player
        System.out.println("Witaj w grze! \nPodaj rozmiar planszy");

        //Choose board size
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        char currentPlayer = 'X';

        //Create an array of chars
        char[][] board = new char[size][size];


        while (true) {
            TicTacToe.printBoard(board);

            //Implements move method
            boolean correctMove = move(board, currentPlayer);
            if (!correctMove) continue;

            //Switch player
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
    }

    public static boolean move(char[][] board, char Player) {
        System.out.println(Player + " Twój ruch.");

        System.out.println("Podaj indeks wiersza");
        Scanner chooseRow = new Scanner(System.in);
        int row = chooseRow.nextInt();

        System.out.println("Podaj indeks kolumny");
        Scanner chooseColumn = new Scanner(System.in);
        int column = chooseColumn.nextInt();

        //Check correct move
        boolean correctMove = board[row][column] == 0;
        if (!correctMove) {
            System.out.println("Ruch niepoprawny");
            return false;
        }
        //Player move
        board[row][column] = Player;
        return true;
    }

    public static void printBoard(char[][] board) {
        int size = board.length;

        //Column headers
        System.out.print("\t");

        //For loop print column headers
        for (int i = 0; i < size; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //Print rows
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
