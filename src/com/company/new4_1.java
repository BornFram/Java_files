import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class new4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "rraakkaatt";
        System.out.println("введите строку");
        String[] letters = new String[]{"r", "k", "t"};
        int counter = 0;
        String[] array_line = new String[0];
        array_line = line.split("");
        for (int k = 0; k < array_line.length; k++) {
            for (int i=0; i<letters.length;i++){
                if (array_line[k].equals(letters[i])) {
                    counter++;
                }
            }
        }
        System.out.println("количество вхождений букв r, k, t = " + counter);
    }
}