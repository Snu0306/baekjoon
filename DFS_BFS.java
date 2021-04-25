import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS_BFS {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int[] visit = new int[N+1];
		
		LinkedList<int[]> que = new LinkedList<int[]>();
		
		for(int i=0; i<que.size(); i++) {
			st= new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int[] stend = new int[] {start,end};
			que.add(stend);
		}
		
		for(int i=1; i<N+1; i++) {
			visit[i] = i;
		}
		
		
		bw.flush();
		bw.close();
		br.close();

	}
	
	public static void dfs(int start,int[] visit, LinkedList<int[]> que) {
		if(que.isEmpty()) return;
		for(int i = 0; i<que.size(); i++) {
			if(start == que.get(i)[0]) {
				visit[i]=0;
				
			}
		}

		
	}
	

}
