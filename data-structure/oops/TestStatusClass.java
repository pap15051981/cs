class TestStatusClass {

    private static int a = 10;

	static class x {
		static public void x1() {
			System.out.println("xxxxxHello World");
		}
	}
	
	public static void main(String argv[]) {
		System.out.println("Hello World");
		x.x1();
	}

	private void test1() {
		System.out.println(" a ");
		System.out.println(a);
	}
}
