import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class new2 {
    public static void one (int x){
        if (x<=-3){
            System.out.println(9);
        }
        else{
            System.out.println(1.0/(Math.pow(x,2)+1));
        }
    }
    public static void two (int angle1,int angle2){
        if (angle1+angle2>=180){
            System.out.println("такой треугольник существовать не может");
        }
        else if (angle1==90 || angle2==90 || angle1+angle2==90){
            System.out.println("Треугольник прямоугольный");
        }
        else{
            System.out.println("Треугольник не прямоугольный");
        }
    }

    public static double vectorLength(int x1,int x2,int y1,int y2){
        double vectorlength = Math.sqrt(Math.abs(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2)));     // считаем длину вектора
        return vectorlength;
    }
    public static void three (int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4){
        if (vectorLength(x1,x2,y1,y2)==vectorLength(x3,x4,y3,y4) & vectorLength(x2,x3,y2,y3)==vectorLength(x1,x4,y1,y4)||
                vectorLength(x1,x3,y1,y3)==vectorLength(x2,x4,y2,y4) & vectorLength(x1,x2,y1,y2)==vectorLength(x3,x4,y3,y4)||
                vectorLength(x1,x4,y1,y4)==vectorLength(x2,x3,y2,y3) & vectorLength(x2,x4,y2,y4)==vectorLength(x1,x3,y1,y3)
        )
        {
            System.out.println("Данные 4 точки является вершинами паралелограма");
        }
        else
        {
            System.out.println("Данные 4 точки не является вершинами паралелограма");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите номер задания");
        int number = Integer.parseInt(reader.readLine());
        switch (number){
            case 1:
                System.out.println("введите x");
                int x = Integer.parseInt(reader.readLine());
                one(x);
                break;
            case 2:
                System.out.println("введите первый угол треугольника");
                int angle1 = Integer.parseInt(reader.readLine());
                System.out.println("введите второй угол треугольника");
                int angle2 = Integer.parseInt(reader.readLine());
                two(angle1,angle2);
                break;
            case 3:
                System.out.println("введите x1");
                int x1 = Integer.parseInt(reader.readLine());
                System.out.println("введите y1");
                int y1 = Integer.parseInt(reader.readLine());
                System.out.println("введите x2");
                int x2 = Integer.parseInt(reader.readLine());
                System.out.println("введите y2");
                int y2 = Integer.parseInt(reader.readLine());
                System.out.println("введите x3");
                int x3 = Integer.parseInt(reader.readLine());
                System.out.println("введите y3");
                int y3 = Integer.parseInt(reader.readLine());
                System.out.println("введите x4");
                int x4 = Integer.parseInt(reader.readLine());
                System.out.println("введите y4");
                int y4 = Integer.parseInt(reader.readLine());
                three(x1,x2,x3,x4,y1,y2,y3,y4);
        }
    }
}
