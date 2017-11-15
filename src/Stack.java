
public class Stack {
	static final int MAX_SIZE = 100;
	int top = -1;
	int[] arr = new int[MAX_SIZE];

	public boolean push(int n) {
		if (top == MAX_SIZE - 1)
			return false;
		arr[++top] = n;
		return true;
	}

	public int pop() {
		if (top == -1)
			return -1;
		return arr[top--];
	}
}
