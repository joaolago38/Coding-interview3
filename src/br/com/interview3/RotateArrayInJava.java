package br.com.interview3;

public class RotateArrayInJava {
	public void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;
		int[] result = new int[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 45;
		nums[3] = 1000;
		RotateArrayInJava raj = new RotateArrayInJava();
		raj.rotate(nums, 4);
		

	}

}
