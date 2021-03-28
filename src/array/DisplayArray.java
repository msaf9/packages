package array;

public class DisplayArray {

	public void displayIntegerArray(final int[] array) {
		int length = array.length;
		while (length > 0) {
			System.out.print(array[array.length - length] + " ");
			length--;
		}
	}
	
	public void displayStringArray(final String[] array) {
		int length = array.length;
		while (length > 0) {
			System.out.print(array[array.length - length] + " ");
			length--;
		}
	}

}
