package edu.depaul.se433.hw1;

/*
Raquib Talukder
SE 433
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Side 1: ");
            side1 = input.nextInt();

            if(side1 <= 0){
                System.err.println("Zero or negative length");
                System.exit(1);
            }

            System.out.print("Side 2: ");
            side2 = input.nextInt();
            if(side2 <= 0){
                System.err.println("Zero or negative length");
                System.exit(1);
            }

            System.out.print("Side 3: ");
            side3 = input.nextInt();
            if(side3 <= 0){
                System.err.println("Zero or negative length");
                System.exit(1);
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }

        String triangleType = new TriangleAssessment(side1, side2, side3).TriangleType();
        System.out.println(triangleType);
    }
}
