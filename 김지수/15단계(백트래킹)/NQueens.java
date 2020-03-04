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
		// level : ���� ���� ���� ��ġ
		if(level == N) {
		// ���� ���� ��ġ�� N���ΰ�?
		// N-1���� ���� �ִµ� N������ �Դٴ°� N-1���� ��� ������ �����Ѵٴ� ��				
			num++;
		}else {
			// level-1������ ��� ���Ǵ�� �Ǿ�����
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
	            //i��° ���� ��ġ�� level��ġ�� ���� ���� �������� �ִ°��
	        	//�Ǵ� i��° ���� ��ġ�� level��ġ�� ���� �밢���� �ִ� ���(�غ��� ���̰� ���� ���)
	        	
	            return false;
	        }
	    }
	    return true;
	}
}
