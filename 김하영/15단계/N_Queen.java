package Step15;

import java.io.*;
import java.util.*;
 
public class N_Queen {
    static int N;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        check = new boolean[N][N];

    }
    
    static boolean check[][];
    static int result;
    
    private static void Queen(int x) {
        if(x==N) {
            result++;
            return;
        }
        for(int i=0;i<N;i++) {
//            if(!dfs(x,i)) continue;
            check[x][i] = true;
            Queen(x+1);
            check[x][i] = false;
        }
    }
    
//    private static boolean dfs(int x,int y) {
//
//    	for(int i=x;i>=0;i--) {
//            if(check[i][y]) return false;
//    	}
//        
//    }
//}
