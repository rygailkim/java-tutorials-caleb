import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/test.txt"));

        List<String> students = new ArrayList<>();

        while(in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for(int i = 0; i < students.size(); i++) {
            System.out.println("Name " + (i + 1) + ": " + students.get(i));
        }

        in.close();

    }
}