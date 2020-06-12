import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class lotto{ 
    static int k;
    static int[] list;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());//k의 갯수
            if(k == 0) break;//입력의 마지막은 0이라는 조건
            
            list = new int[k];
            visited = new boolean[k];
            
            for (int i = 0; i < k; i++) {
                list[i] = Integer.parseInt(st.nextToken());//k의 수만큼 list에 값을 입력
            }
            
            for (int i = 0; i <= k-6; i++) {//6개를 뽑아서 실행하기 때문에
                visited[i] = true;
                solve(i,1);
                visited[i] = false;
            }
            
            sb.append("\n");
        }
        System.out.print(sb.toString());
        
    }
 
    static void solve(int current, int count) {
        
        if(count == 6) {//6번째라면? 해당 숫자를 출력하면 됩니다.
            for (int i = 0; i < k; i++) {
                if(visited[i])
                    sb.append(list[i]+" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = current; i < k; i++) {
            if(visited[i]) continue;//방문했던 곳이라면 넘어가세요.
            
            visited[i] = true;
            solve(i, count+1);//count +1은 선정된 갯수를 하나씩 정해주는것
            visited[i] = false;
        }
    }
    
}