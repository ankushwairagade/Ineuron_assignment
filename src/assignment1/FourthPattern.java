package assignment1;

public class FourthPattern {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();

        int n = 14;
        for (int i = 1; i < n / 2; i++) {
            for (int j = 1; j < n; j++) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    if(j >= n-i)
                    {
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }
}