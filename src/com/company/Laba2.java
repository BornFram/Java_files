package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Laba2 { //var17

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;

        System.out.print("---lab 2. op 17---");
        while(num != 0) {
            System.out.println("");
            System.out.print("Input a number: ");
            num = in.nextInt();

            switch(num) {
                default:
                    System.out.println("task " + num + " is not exist");
                    break;
                case 0:
                    continue;
                case 1:
                    System.out.print("\n Input a value (x): ");
                    int x = in.nextInt();
                    System.out.println(x>3? (1.2*x*x-3*x-9) : ((12.1)/(2*x*x+1)));
                    break;
                case 2:
                    System.out.print("\n Input a values (m n p): ");
                    String str1 = in.next();
                    String str[] = str1.trim().split(" ");
                    float values[] = new float[3]; int count = 0;
                    for(int i=0; i < 3; i++) {
                        values[i] = Float.parseFloat(str[i]);
                        if (values[i] % 1 == 0) {count++;}
                    }
                    System.out.println("output " + count);
                    break;
                case 3:
                    System.out.print("\n Input a values (A B): ");
                    String[] str3 = in.next().trim().split(" ");
                    int[] numbs = {Integer.parseInt(str3[0]), Integer.parseInt(str3[1])};
                    System.out.println(numbs[0]+numbs[1] > 32767? ("overflow") : (numbs[0]+numbs[1]));
                    break;
            }
        }
        System.out.println("END \n");
    }
}
