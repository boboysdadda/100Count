import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Student8 on 10/15/2015.
 */
public class countToHundred {


    public static void main(String[] args) throws IOException{
        File NumberList = new File("NumberList.txt");

        PrintWriter outputFile = new PrintWriter(NumberList);
        for (int i = 1; i <=100; i ++){
            outputFile.println(i);
        }
        outputFile.close();
        System.out.println("File written and closed");

        Scanner inputFile = new Scanner(NumberList);
        System.out.println("File opened for reading");
        while(inputFile.hasNext()){
            int number = inputFile.nextInt();
            System.out.println(number);

        }
        inputFile.close();
        System.out.println("FIle done reading and closed");

    }
}