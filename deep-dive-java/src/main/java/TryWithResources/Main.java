package TryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Main m = new Main();
        m.readFile1();
    }

    public void readFile1() {
        Scanner scanner  = null;
        try{
            scanner = new Scanner(new File("test.txt"));
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }

    public void readFile2() {

    }
}
