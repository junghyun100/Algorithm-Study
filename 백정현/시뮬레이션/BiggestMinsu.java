import java.util.Scanner;

//금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
//N은 4보다 크거나 같고 1,000,000보다 작거나 같은 자연수이다.
class BiggestMinsu
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = N; i >= 4; i--)//4보다 크거나 같아서
        {
            boolean flag = true;
            int num = i;
            while(num!=0){
                if(num %10 == 4|| num %10 ==7)//해당하는 자릿수가 4 or 7인지 확인
                {
                    num /=10;//다음자릿수 확인
                }
                else{//아니라면?
                    flag = false;//아님
                    break;//나감
                }
            }
            if(flag)//모든 자릿수 확인 후 true라면
            {
                System.out.println(i);//출력
                break;
            }
        }
        scanner.close();
    }
}