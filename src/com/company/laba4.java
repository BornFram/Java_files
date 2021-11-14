package com.company;
import java.util.Scanner;

public class laba4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;

        System.out.print("---lab 4. op 17---");
        while(num != 0) {
            System.out.print("");
            System.out.print("Input a number: ");
            num = in.nextInt();

            switch(num) {
                default:
                    System.out.println("task " + num + " is not exist");
                    break;
                case 1:
                    System.out.print("\n Input a string: ");
                    String str = in.next();

                    System.out.println("amebas: " + x);
                    break;
                case 2:
                    System.out.print("\n Input a value (): ");
                    int y = in.nextInt();

                    System.out.println("amebas: " + y);
                    break;
                case 3:
                    System.out.print("\n Input a value (): ");
                    int z = in.nextInt();

                    System.out.println("amebas: " + z);
                    break;
            }
        }
        System.out.println("END \n");
    }
}
