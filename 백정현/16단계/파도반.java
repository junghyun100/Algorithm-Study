public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        long[] pado = new long[101]; // 파도반 수열
        pado[1] = 1;
        pado[2] = 1;
        pado[3] = 1;
        pado[4] = 2;
        pado[5] = 2;
        
        for(int i=6; i<pado.length; i++) { // 6번째부터 규칙이 성립
            
            pado[i] = pado[i-1] + padoq[i-5];
        }
        
        int testCase = Integer.parseInt(st.nextToken());
        for(int j=0; j<testCase; j++) {
            st = new StringTokenizer(br.readLine());
            sb.append(pado[Integer.parseInt(st.nextToken())]+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        
    }    
}