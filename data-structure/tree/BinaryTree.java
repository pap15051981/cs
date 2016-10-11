class BTNode {
	int data;
	BTNode left;
	BTNode right;

	BTNode () {	
		data=0;
		left=null;
		right=null;
	}
	
	BTNode(int d) {
		data = d;
		left = null;
		right = null;
	}
	
	int getData() {
		return data;
	}
	
	void  setData(int d) {
		data = d;
	}

	void setLeft(BTNode n) {
		left=n;
	}

	void setRight(BTNode n) {
		right=n;
	}

	BTNode getLeft() {
		return left;
	}

	BTNode getRight() {
		return right;
	}
}

class BT {
	BTNode root;	

	BT() {
		root=null;
	}

	boolean isEmpty() {
		return root == null;
	}

	void insert(int d) {
		root = insert(root, d);
	}

	BTNode insert (BTNode n, int d) {
		if (n == null) {
			n = new BTNode(d);
		}
		else {
			if (n.getRight() == null) {
				n.right = insert(n.right, d);
			}
			else {
				n.left = insert(n.left, d);
			}
		}
		return n;
	}

	void print() {
		print(root, 0);
	}

	void print(BTNode n, int level){
		if(n==null)
			 return;

		print(n.getRight(), level+1);

		if(level!=0){
			for(int i=0;i<level-1;i++) {
				System.out.print("|\t");
			}
			System.out.println("|-------"+n.getData());
		}
		else {
			System.out.println(n.getData());
		}

		print(n.getLeft(), level+1);
	}   	


	void preorder() {
		preorder(root);
		System.out.println("\n");
	}

	void preorder(BTNode n) {
		if (n == null) {
			return;
		}
		System.out.print(n.getData() + "   ");
		preorder(n.getLeft());
		preorder(n.getRight());
	}

	void inorder() {
		inorder(root);
		System.out.println("\n");
	}

	void inorder(BTNode n) {
		if (n == null) {
			return;
		}
		inorder(n.getLeft());
		System.out.print(n.getData() + "   ");
		inorder(n.getRight());
	}

	void postorder() {
		postorder(root);
		System.out.println("\n");
	}

	void postorder(BTNode n) {
		if (n == null) {
			return;
		}
		postorder(n.getLeft());
		postorder(n.getRight());
		System.out.print(n.getData() + "   ");
	}

}


public class BinaryTree {
	
	public static void main(String[] argv) {
		BT bt = new BT();
		bt.insert(2);
		bt.insert(3);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);
		bt.insert(11);
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);


		bt.print();

		bt.preorder();
		bt.inorder();
		bt.postorder();
	}
	

}


