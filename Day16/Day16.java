import java.util.*;

public class Day16{

    public static void displayPattern(String text, int totalRows) {
        if (totalRows == 1 || text.length() <= totalRows) {
            System.out.println(text);
            return;
        }

        int textLength = text.length();
        char[][] pattern = new char[totalRows][textLength];

        for (int r = 0; r < totalRows; r++) {
            for (int c = 0; c < textLength; c++) {
                pattern[r][c] = ' ';
            }
        }

        int currRow = 0, currCol = 0;
        boolean down = true;

        for (int i = 0; i < textLength; i++) {
            pattern[currRow][currCol] = text.charAt(i);

            if (down) {
                if (currRow == totalRows - 1) {
                    down = false;
                    currRow--;
                    currCol++;
                } else {
                    currRow++;
                }
            } else {
                if (currRow == 0) {
                    down = true;
                    currRow++;
                } else {
                    currRow--;
                    currCol++;
                }
            }
        }

        for (int r = 0; r < totalRows; r++) {
            for (int c = 0; c < textLength; c++) {
                System.out.print(pattern[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern("PAYPALISHIRING", 4);
    }
}
