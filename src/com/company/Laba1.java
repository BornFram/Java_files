package com.company;
import java.util.Scanner;

public class Laba1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;

        System.out.print("---lab 1. op 17---");
        while(num != 0) {
            System.out.println("");
            System.out.print("Input a number: ");
            num = in.nextInt();

            switch(num) {
                default:
                    System.out.println("task " + num + " is not exist");
                    break;

                case 1:
                    System.out.print("\n Input a value (z): ");
                    int z = in.nextInt();
                    System.out.println(((4*z-4)*(4*z-4))/(4-8*z+8*z*z));
                    break;
                case 2:
                    System.out.print("\n Input a value (x): ");
                    int x = in.nextInt();
                    System.out.println(Math.log10(x*2)/(1 + Math.log10(x)*Math.log10(x)));
                    break;
                case 3:
                    System.out.print("\n Input a value (x): ");
                    x = in.nextInt();
                    System.out.println(-2*x+3*x*x-4*x*x*x);
                    System.out.println(1+2*x+3*x*x+4*x*x*x);
                    break;

            }
        }
        System.out.println("END \n");
    }
}
