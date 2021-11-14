package com.company;
import java.util.Scanner;

public class laba3 { //var17

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;

        System.out.print("---lab 3. op 17---");
        while(num != 0) {
            System.out.println("");
            System.out.print("Input a number: ");
            num = in.nextInt();

            switch(num) {
                default:
                    System.out.println("task " + num + " is not exist");
                    break;
                case 1:
                    System.out.print("\n Input a value (hour): ");
                    int hour = in.nextInt(); long amebas = 1;
                    for (int i=1; i < hour; i++){
                        if (i % 3 == 0) {amebas*=2;}
                    }
                    System.out.println("amebas: " + amebas);
                    break;
                case 2:
                    System.out.print("\n Input a value (N): ");
                    int N = in.nextInt(); double result = 1;
                    for (int i=1;i<N;i++){
                        result *= (2.0*i)/(2.0*i+1.0);
                        //System.out.println("result: " + result);
                    }
                    System.out.println("result: " + result);
                    break;
                case 3:
                    System.out.print("\n processing");
                    int n = 1;
                    double a = (2 * n - 1)/(Math.pow(2,n)), sum = a, e = 0.001;
                    while (a > e){
                        n++; a = (2 * n - 1)/(Math.pow(2,n)); sum += a;
                    }
                    System.out.println("\n result: " + sum);
                    break;
            }
        }
        System.out.println("END \n");
    }
}
