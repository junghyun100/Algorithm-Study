import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueens {
	static int N, num;
	static int[] cols;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		cols = new int[N];
		
		BackTracking(0);
		
		System.out.println(num);
		br.close();
	}
	static void BackTracking(int level) {
		// level : 현재 따질 행의 위치
		if(level == N) {
		// 현재 따질 위치가 N열인가?
		// N-1까지 행이 있는데 N열까지 왔다는건 N-1까지 모두 조건을 만족한다는 뜻				
			num++;
		}else {
			// level-1까지는 모두 조건대로 되어있음
			for(int i = 0; i<N; i++) {
				cols[level] = i;
				if(isPossible(level)) {
					BackTracking(level+1);	
				}
			}
		}
	}
	static boolean isPossible(int level){
	    for(int i=0;i<level;i++){
	        if(cols[i]==cols[level] || Math.abs(level-i)== Math.abs(cols[level]-cols[i])){
	            //i번째 퀸의 위치와 level위치의 퀸이 같은 일직선상에 있는경우
	        	//또는 i번째 퀸의 위치와 level위치의 퀸이 대각선상에 있는 경우(밑변과 높이가 같은 경우)
	        	
	            return false;
	        }
	    }
	    return true;
	}
}
