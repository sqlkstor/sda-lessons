package com.sda.lessons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int tab01[] = new int [3];
        tab01[0] = 1;
        tab01[0] = 2;
        tab01[0] = 3;

        int tab02[] = {1,2,3};


        int tab03[][] = new int [3][3];
        tab03[0][0] = 1;
        tab03[0][1] = 2;
        tab03[0][2] = 3;
        tab03[1][0] = 4;
        tab03[1][1] = 5;
        tab03[1][2] = 6;
        tab03[2][0] = 7;
        tab03[2][1] = 8;
        tab03[2][2] = 9;

        int tab04[][] = {
                {1,2,3},
                {4,5,6,4},
                {7,8,9},
                {4,5,3,6,7,1}
        };


        int tab5[][] = new int[3][];
        tab5[0] = new int[8];
        tab5[0] = new int[3];
        tab5[0] = new int[5];

        for (int i = 0; i < (tab04.length); i++) {
            int[] innerTable = tab04[i];
            int innerLength = innerTable.length;
            for (int j =0; j < innerLength; j++){
                System.out.print(innerTable[j] + ", ");
            }
            System.out.print("\n");
        }

    }
}
