package week6;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[7];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		
		System.out.println();
		
		//System.arraycopy() 메소드 이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		
		System.out.println();
		
		//Arrays 클래스 이용
		arr2 = Arrays.copyOf(arr1, 3);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
	}
}
