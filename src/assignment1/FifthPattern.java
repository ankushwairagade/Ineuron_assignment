package assignment1;

public class FifthPattern {


    public static void main(String[] args)
    {
        int i, j, rows=6;

        for (int k = 0; k < rows*2 +2; k++) {
            System.out.print("*");
        }
        System.out.println();

        for (i = rows; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 2; i <= rows+1; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 0; k < rows*2+2; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}