package binarytree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(80);
		tree.add(25);
		tree.add(251);
		tree.add(2532);;
		tree.add(2436435);
		tree.add(2);
		System.out.println(tree.size());
		System.out.println(tree.remove(251));
		System.out.println(tree.contains(251));
		System.out.println(tree.size());
	}

}
