import java.io.IOException;
import java.util.Scanner;

public class new6 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер задания");
        int number = sc.nextInt();
        switch (number){
            case 1:
                int Min = -40;
                int Max = 30;
                int n =3;
                int m =4;
                int[][] twoDimArray={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
                int num=Min + (int)(Math.random() * ((Max - Min) + 1));
                Boolean isPrime=true;
                int temp;
                // проверяем число на простоту
                for (int i=2; i<=num/2; i++) {
                    temp = num % i;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {  //идём по строкам
                    for (int j = 0; j < m; j++) {//идём по столбцам
                        if (i!=j)
                        System.out.print("  " + twoDimArray[i][j] + "  ");//вывод элемента
                        else
                        System.out.print(" ("+twoDimArray[i][j]+") ");
                    }
                    System.out.println();//перенос строки ради визуального сохранения табличной формы
                }

            case 2:
        }
        // если переменная isPrime равна true, то число простое
//        if(isPrime)
//            System.out.println(num + " - простое число");
//        else
//            System.out.println(num + " - составное число");
    }
}

