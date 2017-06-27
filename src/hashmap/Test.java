package hashmap;

public class Test {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		for (int i = 0; i < 128*3/4; i++) {
			map.put(i, i+1);
		}
		System.out.println(map.getArray().length);
		for (int i = 0; i < 128*3/4; i++) {
			map.put(i, i+1);
		}
		System.out.println(map.getArray().length);
	}

}
