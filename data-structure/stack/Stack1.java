class Stack1 {

	public static void main(String[] argv) {
		Stack1 s1 = new Stack1(5);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.print();
		s1.pop();
		s1.print();
		s1.pop();
		s1.print();
	}

	private int size;
	private int top=-1;
	private int[] StackArr;
	
	Stack1(int s) {
		size=s;
		StackArr = new int[s];
	}

    void push(int item) {
        if (isFull()) {
			System.out.println("Stack is full " + Integer.toString(item));
		}
        else {
			top++;
			StackArr[top] = item;
			System.out.println(item + " push");
		}
	}

	int pop() {
		int result=-1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			result=StackArr[top];
			top--;
		}
		return result;
	}

	boolean isEmpty () {
		return top == -1;
	}

	boolean isFull () {
		return top == (size-1);
	}

	void peek() {
		if (!isEmpty()) {
			System.out.println("peek" + Integer.toString(StackArr[top]));
		}
	}

	void print() {
		if (!isEmpty()) {
			for(int i=0;i<=top;i++) {
				System.out.print(Integer.toString(StackArr[i]) + " ");
			}
			System.out.println("\n");
		}
	}
}
