import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class new3 {
    public static  void One(){
        int count_ameb =1;
        for (int i=0;i<=24;i+=3){
            count_ameb*=2;
            System.out.println(count_ameb);
        }
        System.out.println(count_ameb);
    }

    public static void Two(int N){
        float P=1f;
        for (int i=1;i<=N;i++){
            System.out.println(i);
            System.out.println(P);
            P*=(2.0*i/(2*i+1));
        }
        System.out.println(P);
    }
    public static void Three(double accuracy){
        int n=1;
        double an=(2*n-1)/Math.pow(2,n);
        double sum=an;
        while (an>accuracy)
        {
            n+=1;
            an=(2*n-1)/Math.pow(2,n);
            sum+=an;
            System.out.println(sum);
            System.out.println(an);
        }
        System.out.print(sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите номер задания");
        String number= reader.readLine();
        int numbers = Integer.parseInt(number);
        switch (numbers){
            case 1:
                System.out.println("введите количество часов");
                int count_hour = Integer.parseInt(reader.readLine());
                One();
                break;
            case 2:
                System.out.println("введите N");
                int N = Integer.parseInt(reader.readLine());
                Two(N);
                break;
            case 3:
                Three(Math.pow(10,-3));
                break;
            default:
                System.out.println("пожалуйста выбирите другой номер");
                break;
        }
    }
}
