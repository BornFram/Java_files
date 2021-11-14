import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class new1 {
    public static void One(int b){
        System.out.println((5*b-10)/(4-4*b-b^2));
    }
    public static void Two(int x){
        System.out.println(Math.log10(Math.pow(x,3)+4*Math.sqrt(x)+5));
    }
    public static void Three(int one,int zn, int count){
        System.out.print("суммa членов арифметической прогрессии ");
        System.out.println(((2*one+zn*(count-1))/2)*count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите номер задания");
        String number= reader.readLine();
        int numbers = Integer.parseInt(number);
        switch (numbers){
            case 1:
                System.out.println("введите b");
                int b = Integer.parseInt(reader.readLine());
                One(b);
                break;
            case 2:
                System.out.println("введите x");
                int x = Integer.parseInt(reader.readLine());
                Two(x);
                break;
            case 3:
                System.out.println("введите первый член");
                int one = Integer.parseInt(reader.readLine());
                System.out.println("введите знаменатель");
                int zn = Integer.parseInt(reader.readLine());
                System.out.println("введите число членов прогрессии");
                int count = Integer.parseInt(reader.readLine());
                Three(one,zn,count);
                break;
            default:
                System.out.println("пожалуйста выбирите другой номер");
                break;
        }
    }
}



