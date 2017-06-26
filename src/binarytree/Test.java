package binarytree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(80);
		tree.add(25);
		System.out.println(tree.remove(25));
		System.out.println(tree.contains(25));
	}

}
