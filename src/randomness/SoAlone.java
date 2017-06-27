package randomness;

public class SoAlone {

	public static void main(String[] args) {
		for (int i = 0; i < 100000000; i++) {
			System.out.print("I am ");
			for (int j = 0; j < i; j++) {
				System.out.print("so ");
			}
			System.out.print("alone.");
			System.out.println();
		}
	}

}
