import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();//끊어진 기타
        int M =sc.nextInt();//브랜드
        int Min = Integer.MAX_VALUE;
        int[] pack = new int[M];
        int[] unit = new int[M];

        for(int i=0; i<M; i++){
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }

        Arrays.sort(pack);
        Arrays.sort(unit);
        Min = Math.min(((N/6)+1)*pack[0], N*unit[0]);//가장 싼 6개짜리 팩 구매 vs 가장 싼 낱개 구매
        Min = Math.min(Min, ((N/6))*pack[0] + (N%6)*unit[0]);//vs (가장싼 6개짜리 팩 + 낱개)
        
        System.out.println(Min);
    }
}
/*
1. 6개짜리 팩과 낱개를 각각 배열에 저장한다.

2. 팩, 낱개 배열을 정렬한다. (가장 적은 비용이 먼저 오도록)

3. 비교한다.

 - 가장 싼 6개짜리 팩으로 모두 살 것인지

 - 가장 싼 낱개로 모두 살 것인지

 - 가장싼 6개짜리 팩과 가장 싼 낱개를 이용해서 살 것인지 
 */