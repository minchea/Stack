import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack stack = new Stack();
		for(int i = 0; i < n; i++){
			boolean result = stack.push(in.nextInt());
			if(result == false){
				System.out.println("stack is full!!!!");
				break;
			}
		}
		
		
		for(int i = 0; i < n; i++) System.out.println(stack.pop());
	}
}
