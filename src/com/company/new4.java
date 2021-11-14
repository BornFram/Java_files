import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class new4
{
    public static void main(String[] args) throws IOException
    {
        String[] letters  = new String[] {"а","и","е","ё","о","y","ы","э","ю","я"};
        int counter =0;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("введите номер задания");
//        String number= reader.readLine();
//        int numbers = Integer.parseInt(number);
//        switch (numbers)
//        {
//            case 1:
//                System.out.println("стих");
//        }
        try
        {
            File file = new File("src/resources/text.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null)
            {
                System.out.println(line);
                String[] array_line = new String[0];
                array_line = line.split("");
                for (int i=0;i<array_line.length;i++)
                {
                  //  System.out.println(array_line[i]);
                    for (int k=0;k<letters.length;k++){
                        if (array_line[i].equals(letters[k]))
                        {
                            counter++;
                        }
                    }

                }
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("гласные буквы встечаются "+counter+" раз");
    }
}
