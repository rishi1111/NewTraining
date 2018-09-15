import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };

		// for (int i : ar) {
		//
		// System.out.println(i);
		//
		//
		// }

		// int[][] jaggu= {{1,2},{3,4,5},{6,7,8,9}};
		//
		// for (int[] is : jaggu) {
		//
		// for (int i : is) {
		// System.out.print(i+" ");
		// }
		//
		// System.out.println();
		// }
		//

		int[] srt = { 7, 3, 5, 2, 4 };

//		for (int i = 0; i < srt.length - 1; i++) {
//
//			for (int j = 0; j < srt.length - 1 - i; j++) {
//
//				if (srt[j] > srt[j + 1]) {
//
//					int temp = srt[j];
//					srt[j] = srt[j + 1];
//					srt[j + 1] = temp;
//				}
//
//			}
//		}
		Arrays.sort(srt);

		for (int i : srt) {
			System.out.print(i + " ");
		}

	}
}
