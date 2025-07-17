package lec18;

public class N_queen {

    public static void main(String[] args) {
        int q = 4;
        int[][] arr = new int[4][4];
        place(0, q, arr);
    }

    public static void place(int row, int q, int[][] arr) {
        if (q == 0) {
            print(arr);
            return;
        }

        for (int col = 0; col < arr[0].length; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1;
                place(row + 1, q - 1, arr);
                arr[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int row, int col, int[][] arr) {
        // up
        int r = row;
        while (r >= 0) {
            if (arr[r][col] == 1) return false;
            r--;
        }

        // left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 1) return false;
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < arr[0].length) {
            if (arr[r][c] == 1) return false;
            r--;
            c++;
        }

        return true;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
