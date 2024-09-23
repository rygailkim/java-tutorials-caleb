import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Queue");
        names.add("Caleb");
        names.add("Sue");
        names.add("Sally");
        names.add("Stack");

        System.out.println(names.remove()); // use linked list as a queue

        System.out.println(names.removeLast()); // use linked list as a stack
    }
}