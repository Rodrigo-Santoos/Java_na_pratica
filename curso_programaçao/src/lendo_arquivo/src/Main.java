import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        File file = new File("C:\\Users\\Estudos\\Downloads\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException io){
            System.out.println("Error: " + io.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }

        }
    }
}