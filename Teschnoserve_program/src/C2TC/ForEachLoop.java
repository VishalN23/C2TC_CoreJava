package C2TC;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] x = { 10, 11, 12, 13 };

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

		System.out.println("\n\n***************\n");

		for (int i : x) {
			System.out.print(i + " ");
		}

	}

}
