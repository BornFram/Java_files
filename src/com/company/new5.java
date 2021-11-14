import java.io.IOException;
import java.util.Scanner;

public class new5 {
    public static <string> int exeption_K1 (int size, string range){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("введите "+range);
            int k1 = sc.nextInt();
            if (k1<size && k1>=0){
                return k1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива");
        int size = sc.nextInt();
        int  score=0;
        int [] array = new int[size];

        for (int i=0;i<array.length;i++) {
            int a = (int) Math.round(Math.random()*31);
            array[i] =a ;
            System.out.print(array[i]+", ");
            if (i==array.length-1){
                System.out.println(" ");
            }
        }
        int k1 = exeption_K1(size,"k1");
        int k2 = exeption_K1(size,"k2");

        if (k1<=k2){
            for (int i=k1;i<=k2;i++) {
                score+=array[i];
            }
        }
        else {
            for (int i=k2;i<=k1;i++) {
                score+=array[i];
            }
        }

        System.out.println("сумма с "+k1+" по "+k2+" "+score);
    }
}
