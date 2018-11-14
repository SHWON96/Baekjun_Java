package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2440 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<num; i++) {
			for(int j=num; j>i;j--) {
				sb.append("*");
			}
			
			sb.append("\n");
			
		}System.out.println(sb);
	}

}