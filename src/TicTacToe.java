public class TicTacToe {
    public static void main(String[] args) {
        int size = 3;
        char[][] board = {  {'O', 'X', 'X'},
                            {'O', 'X', ' '},
                            {' ', 'O', 'O'}};
        TicTacToe.printBoard(board);
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
