import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Lie{
    static int N, M, K;//사람의 수 N과 파티의 수 M, 이야기의 진실을 아는 사람의 수
    static int count;//과장된 이야기를 할 수 있는 파티 수
    static ArrayList<Integer> party[];
    static ArrayList<Integer> people[];
    static ArrayList<Integer> know;
    static boolean visited[];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        people = new ArrayList[N+1];
        for(int i = 0 ; i < N+1;i++)
        {
            people[i] = new ArrayList<>();
        }
        party = new ArrayList[M+1];
        for(int i = 0 ; i < M+1;i++)
        {
            party[i] = new ArrayList<>();
        }
        know = new ArrayList<>();
        visited = new boolean[M+1];

        for(int i = 0 ; i < K; i++)
        {
            know.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            for(int j = 0 ; j < num; j++)
            {
                int value = Integer.parseInt(st.nextToken());
                party[i].add(value); //party의 arraylist에 사람의 번호 추가
                people[value].add(i);//사람의 arraylist에 파티의 번호 추가 = 이렇게 하면 서로가 그래프로 연결된 노드들 처럼 그려짐
            }
        }
        bfs();
        System.out.println(count);
    }
    public static void bfs(){
        Queue<Integer> queue= new LinkedList<Integer>();
        for(int i = 0 ; i < know.size();i++)//진실을 아는 사람의 수만큼
        {
            for(int j=0; j < people[know.get(i)].size();i++)//진신을 아는 사람의 번호 만큼
            {
                if(!visited[people[know.get(i)].get(j)])//방문한 적이 없다면?(거짓말을 해도 상관없다면)
                   { visited[people[party[know.get(i)].get(i)].get(j)]=true;
                    queue.add(people[party[know.get(i)].get(i)].get(j));// queue에 추가
                    }
                }
        }
        while(!queue.isEmpty()){
            int value = queue.poll();
            for(int i = 0; i < party[value].size();i++)//진실을 알고있는 사람이 참여한 파티가 들어있는값을 value에 넣음
            {                                          //그 파티에 속한 사람들도 진실을 알아야하므로 연결된 사람들을 체크함
                for(int j=0; j < people[party[value].get(i)].get(j);j++)//사람들의 arrsylist번호에 몇번쨰 파티인지 
                {
                    if(!visited[people[party[value].get(i)].get(j)])
                    {                   //해당 값에 방문한 적이 없다면 거짓말을 해도된다면
                    visited[people[party[value].get(i)].get(j)] = true;// true
                    queue.add(people[party[value].get(i)].get(j));
                    }
                }
            }
        }
        for(int i = 0 ; i < M;i++)
        {
            if(!visited[i]){
                count++;
            }
        }
    }
}