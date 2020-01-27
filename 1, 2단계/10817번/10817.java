import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int aws;
	
	if(a>b)
	{
		aws = a;
		a = b;
		b = aws;
	}
	if(a>c)
	{
		aws= a;
		a = c;
		c = aws;
	}
	if(b>c)
	{
		aws = b;
		b = c;
		c = aws;
	}
	System.out.println(b);
		
	}
}
