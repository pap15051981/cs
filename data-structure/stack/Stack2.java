// import java.lang.reflect.Array;

class Stack2 <T> {
	int top = -1;
	int size;
    T[] arr;

	@SuppressWarnings("unchecked")
	Stack2(int s) {
		size = s;
		arr = (T[]) (new Object[size]);
	}

	void push(T i) {
		top++;
		System.out.println(top);
		System.out.println(i.toString());
		arr[top] = i;
	}

	T pop() {
		T result = arr[top];
		top--;
		return result;
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == (size-1);
	}

	void print() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i].toString());
		}
		System.out.println("\n");
	}
	

	public static void main(String[] argv) {
		Stack2<Integer> s2 = new Stack2<Integer>(5);
		s2.push(new Integer(2));
		s2.push(new Integer(21));
		s2.push(new Integer(22));

		s2.print();
		
	}
}
