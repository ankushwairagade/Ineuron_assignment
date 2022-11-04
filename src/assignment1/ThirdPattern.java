package assignment1;

public class ThirdPattern {

    public static void main(String[] args) {



        int n = 12;
        for (int i = n/2; i > -1; i--) {
            for (int j = n; j  > -1; j--) {

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


        for (int i = 0; i < n/2; i++) {

            for (int j = 0; j < n+1; j++) {

                if(i== n/2-1)
                {
                    System.out.print("* ");
                }else if(j == 0 || j == n)
                {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }



    }
    }

