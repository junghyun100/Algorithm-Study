import java.util.Scanner;

public class SecondNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int second;
        if(a > b){
            if(a > c){ // a > b, a > c
                if(b > c){
                    second = b;
                }
                else{
                    second = c;
                }
            }
            else{ // c > a > b
                second = a;
            }
        }
        else{ // a < b
            if(a > c){ // b > a > c
                second = a;
            }
            else{ // b > a , c > a 
                if(b > c){ // b > c > a
                    second = c;
                }
                else{ // c > b > a
                    second = b;
                }
            }
        }
        System.out.println(second);
        sc.close();
    }
}