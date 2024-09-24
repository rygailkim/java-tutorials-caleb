import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] data = {
                {5, 10, 13, 14},
                {16, 20, 22, 24},
                {25, 29, 30, 35}
        };

        System.out.println(data[1][2]);

        data[1][2] = 49;
        System.out.println(data[1][2]);

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
         }
    }
}