package programmers_Hanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		
		br.close();
	}

	public void hanoi() {
		
	}
	
	public void move(char a, char b, int n) {
		System.out.println(n + a + " -> " + b);
	}

}
