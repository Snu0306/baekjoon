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
			int papers = Integer.parseInt(st.nextToken()); //������ ����
			int order = Integer.parseInt(st.nextToken()); // �ñ��� 한글테스트 
			int imp = 0; //�� ������ �߿䵵
			
			st = new StringTokenizer(br.readLine()); //���� �ε��� ���� �߿䵵
			
		
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
