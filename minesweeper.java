import java.util.Scanner;
public class minesweeper {
    Scanner input = new Scanner(System.in);
    public static void minesweeper(Scanner ScannerObj) {
        // Prompt the user for the number of rows, columns, and mines
        System.out.println("Enter the number of rows (max 25): ");
        int rows = ScannerObj.nextInt();
        System.out.println("Enter the number of columns (max 25): ");
        int cols = ScannerObj.nextInt();
        System.out.println("Enter the number of mines: (max 25)");
        int mines = ScannerObj.nextInt();
        //** Initialize the game board
        // rows
        gameboard(rows, cols, mines);
    }
    public static void gameboard(int rows, int cols, int mines){
        String hashes = "#  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #";
        String numbers = "  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int twoRows = rows*3;
        int r = 0;
        System.out.println(numbers.substring(0, (twoRows+1)));
        for (int i = 0; i < cols; i++){
            r++;
            System.out.println(letters.substring((r-1), r)+" "+hashes.substring(0, twoRows));
        }
    }
}