package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N9498 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("F");

	}

}