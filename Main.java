import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		Queue<Integer> ans = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		
		while(N-->0) {
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int papers = Integer.parseInt(st.nextToken()); //문서의 개수
			int order = Integer.parseInt(st.nextToken()); // 궁금한 문서가 몇번째 놓여있는지
			int imp = 0; //그 문서의 중요도
			
			st = new StringTokenizer(br.readLine()); //문서 인덱스 별로 중요도
			
		
			for(int i=0; i<papers; i++) {
				int temp = Integer.parseInt(st.nextToken());
				ans.offer(temp);
				if(i==order) imp =temp;
			}
			
			
			for(int i=0; i<papers; i++) {
				int temp = ans.poll();
				if(temp > imp) {
					ans.add(temp);
				}
				for(int s : ans) {
					sb.append(s+" ");
					
				}
				sb.append("\n");
			}
			System.out.println(sb);
			
			
			
			
			
			
		}
		
	}

}
