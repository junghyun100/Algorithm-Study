import java.util.Scanner;

public class Teach{
    static int N, K, result;
    static boolean[][] word;
    static boolean[] visit;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        word = new boolean[N][26];//N = 단어, 26 = 알파벳 글자
        for(int i = 0 ; i < N; i++)
        {
            final String temp = scanner.next();//단어 받고
            for(int j = 0 ; j < temp.length();j++)
            {
                word[i][temp.charAt(j)-'a'] = true;//글자마다 true인지 아닌지 확인
            }
        }
        visit = new boolean[26];//방문했는가?
        result = 0;//초기화
        solve(0,0);
        System.out.println(result);
    }
    private static void solve(final int index, final int depth){
        if(depth == K)//depth가 K 즉 K 수만큼 글자를 배웠는가?
        {
            check();//판단
            return;
        }
        for(int i = index; i < 26; i++)//모든 알파벳을 비교
        {
            if(!visit[i]){//방문한적이 없으면?
                visit[i] = true;//방문
                solve(i, depth + 1);//K의 갯수를 1개씩 늘려주면서 반복
                visit[i] = false;//다시 빠져나오면서 false로 돌려줌
            }
        }
    }
    private static void check(){
        int count = 0;
        boolean flag = true;
        for(int k = 0 ; k < N; k++){
            flag = true;
            for(int i = 0 ; i < 26; i++){//모든 단어를 확인한다
                if(word[k][i] && !visit[i])//이때 모든 문자열을 각 단어들을 확인하면서 이미 방문한 적이 없다면 false;
                {
                    flag = false;//못 배운 단어
                    break;
                }
            }
            if(flag)//flag가 true라면 다 배울수 있는 열이므로 count의 갯수가 늘어남
                count ++;
        }
        result = Math.max(count, result);//여태 배운 단어의 수로 count가 늘어나는데 모든 K에 대해서 비교하므로 현재 결과랑 비교해서 더 큰값
    }
}