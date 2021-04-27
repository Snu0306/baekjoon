import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			
			if(i==0 && j==0) break;			
			if(i%j!=0 && j%i !=0) {
				sb.append("neither \n");
			}else if(i%j ==0 && j%i !=0) {
				sb.append("multiple \n");
			}else {
				sb.append("factor \n");
			}
			
			
		}
		
		System.out.println(sb);
		
	}

}
