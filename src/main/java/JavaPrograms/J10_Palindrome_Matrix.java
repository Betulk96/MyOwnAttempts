package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J10_Palindrome_Matrix {
    public static void main(String[] args) {
//31. Check Given No is palindrome or Not

        String original, reverse = "";
        System.out.println("Enter a string to check if it is a palindrome");
        original = input.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        if (original.equals(reverse)) System.out.println("Your String is a polindrome");
        else System.out.println("Your String is not a polindrome");

//Another Method


        String inputString;

        System.out.println("Input a string");
        inputString = input.nextLine();
        int length = inputString.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }

        if (i == middle + 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
//32. How to add two matrix
        System.out.println("Enter the number of rows  of matrix :");
        int row = input.nextInt();
        input.nextLine();
        System.out.println("Enter the number of columns of matrix :");
        int colums = input.nextInt();
        input.nextLine();

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < colums; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
//another method
        int m, n, c, d;

        System.out.println("Enter the number of rows and columns of matrix");
        m = input.nextInt();
        n = input.nextInt();
        input.nextLine();

        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                first[c][d] = input.nextInt();
        }

        System.out.println("Enter the elements of second matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                second[c][d] = input.nextInt();
        }

        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d]; //replace '+' with '-' to subtract matrices

        }

        System.out.println("Sum of entered matrices:-");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                System.out.print(sum[c][d] + "\t");
            System.out.println();
        }
//33. How to multiply two matrix

        int x, y, p, q, sum2 = 0, k;

        System.out.println("Enter the number of rows and columns of first matrix");
        x = input.nextInt();
        y = input.nextInt();
        int[][] first2 = new int[x][y];
        System.out.println("Enter the elements of first matrix");
        for (c = 0; c < x; c++)
            for (d = 0; d < y; d++)
                first2[c][d] = input.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix");
        p = input.nextInt();
        q = input.nextInt();
        if (y != p)
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else {
            int[][] second2 = new int[p][q];
            int[][] multiply = new int[x][q];
            System.out.println("Enter the elements of second matrix");
            for (c = 0; c < p; c++) {
                for (d = 0; d < q; d++)
                    second2[c][d] = input.nextInt();
            }
            for (c = 0; c < x; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++) {
                        sum2 = sum2 + first2[c][k] * second2[k][d];
                    }
                    multiply[c][d] = sum2;
                    sum2 = 0;
                }
            }
            System.out.println("Product of entered matrices:-");
            for (c = 0; c < x; c++) {
                for (d = 0; d < q; d++)
                    System.out.print(multiply[c][d] + "\t");
                System.out.print("\n");
            }
        }

//        int m, n, c, d;

//        System.out.println("Enter the number of rows and columns of matrix");
//        m = input.nextInt();
//        n = input.nextInt();
//        int[][] matrix = new int[m][n];
//        System.out.println("Enter the elements of matrix");
//        for (c = 0; c < m; c++)
//            for (d = 0; d < n; d++)
//                matrix[c][d] = input.nextInt();
//        int[][] transpose = new int[n][m];
//        for (c = 0; c < m; c++) {
//            for (d = 0; d < n; d++)
//                transpose[d][c] = matrix[c][d];
//        }
//        System.out.println("Transpose of entered matrix:-");
//        for (c = 0; c < n; c++) {
//            for (d = 0; d < m; d++)
//                System.out.print(transpose[c][d] + "\t");
//            System.out.print("\n");
//        }
//        /*3x2
//        1	4
//        2	5
//        3	6
//        */


    }

}