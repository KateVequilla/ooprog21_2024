public class TableAndChairs {
    public static void main(String args[]) {
        int row, column;

        for (row = 1; row <= 2; row++) {
            for (column = 1; column <= 26; column++) {
                if (column == 1 || column == 26) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (row = 3; row <= 3; row++) {
            for (column = 1; column <= 26; column++) {
                if (column == 1 || (column > 7 && column < 20) || column == 26) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (row = 4; row <= 4; row++) {
            for (column = 1; column <= 26; column++) {
                if (column < 6 || column == 8 || column == 19 || column > 21 || column == 26) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (row = 5; row <= 5; row++) {
            for (column = 1; column <= 26; column++) {
                if (column == 1 || column == 5 || column == 8 || column == 19 || column == 22 || column == 26) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (row = 6; row <= 6; row++) {
            for (column = 1; column <= 26; column++) {
                if (column == 1 || column == 5 || column == 8 || column == 19 || column == 22 || column == 26) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
