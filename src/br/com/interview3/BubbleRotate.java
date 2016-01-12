package br.com.interview3;

public class BubbleRotate {

	public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] meuArray;
		meuArray = new int[10];
		meuArray[0] = 100;
		meuArray[1] = 85;
		meuArray[2] = 88;
		meuArray[3] = 93;
		meuArray[4] = 123;
		meuArray[5] = 952;
		meuArray[6] = 344;
		meuArray[7] = 233;
		meuArray[8] = 622;
		meuArray[9] = 8522;
		BubbleRotate br = new BubbleRotate();

	}

}
