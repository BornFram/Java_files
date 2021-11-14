import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class new4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите строку");
        String line = reader.readLine();
        int counter1 = 0;
        int counter2 = 0;
        String[] array_line = new String[0];
        array_line = line.split("");
        for (int k = 0; k < array_line.length; k++) {
            if (array_line[k].equals(")")) {
                counter1++;
            }
            if (array_line[k].equals("(")) {
                counter2++;
            }
        }
        if (counter1==counter2){
            System.out.println("число открывающихся и закрывающихся скобок в данной строке одинаковое");
        }
        else {
            System.out.println("число открывающихся и закрывающихся скобок в данной строке НЕ одинаковое");
        }

    }
}