package hanoi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		hanoi(n, 'a', 'b', 'c');
	}

	public static void move(char a, char b){
		System.out.println(a + " -> " + b);
	}
	
	public static void hanoi(int n, char from, char by, char to){
		if(n == 1){
			move(from, to);
		}else {
			hanoi(n-1, from, to, by);
			move(from, to);
			hanoi(n-1, by, from, to);
		}
	}
}
