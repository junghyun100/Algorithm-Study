import java.io.*;
import java.util.Scanner;

public class Div{
    public static void main(String[] args){
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a / b);
        sc.close();
    }
}