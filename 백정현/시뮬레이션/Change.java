import java.util.Scanner;

class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();// 크기가 N인 수열
        int K = scanner.nextInt();// K번 했을 때(얼마나 반복할 것인가)
        int[] A = new int[N];// 크기가 N인 수열 A
        String[] t = new String[N];// 5,6,3,9,-1가 입력됨
        String str = scanner.next();
        t = str.split(",");// ,를 기준으로 입력을 구분함
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(t[i]);// 해당값은 String 형에서 char로 구분되었고 이것을 Integer형으로 변경
        }
        for(int time = 0; time<K;time++){
            for(int i =0; i< N-1;i++)
            {
                A[i]=A[i+1]-A[i];//B[i] = A[i+1]-A[i]
            }
        }
        for(int i = 0 ; i< N -K ;i++)//N-K인 이유는 반복할 수록 K만큼 횟수가 줄어들기 때문
        {
            System.out.print(A[i]);
            if(i!=N-K-1)System.out.print(',');
        }

    }
}