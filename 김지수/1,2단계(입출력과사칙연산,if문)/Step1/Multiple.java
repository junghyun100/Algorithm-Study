import java.io.*;
import java.util.Scanner;

public class Multiple{
    public static void main(String[] args){
        int a, b;
        int units, tens, hundreds;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        units = b%10; // 5
        tens = b%100 - units; // 85 - 5 = 80
        hundreds = b - tens - units; // 385 - 80 - 5

        units = a * units;
        tens = a * tens;
        hundreds = a * hundreds;
        System.out.println(units);
        System.out.println(tens / 10);
        System.out.println(hundreds / 100);
        System.out.println(hundreds + tens + units);
        sc.close();
    }
}