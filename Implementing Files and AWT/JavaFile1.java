import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("JavaFile1.txt");

        System.out.println("Enter 4 lines:");

        for (int i = 1; i <= 4; i++) {
            String text = sc.nextLine();
            fw.write(text);
            fw.write("\n");
        }

        fw.close();
        sc.close();

        System.out.println("File created successfully.");
    }
}