package demo;

import array.DisplayArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayArray d = new DisplayArray();
		int array1[] = { 1, 2, 3 };
		d.displayIntegerArray(array1);
		
		System.out.println();
		
		String array2[] = {"a", "b", "c"};
		d.displayStringArray(array2);
	}
}
