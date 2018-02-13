package binarySearch;
/*Added for Binary Search */
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the size of sorted input Array: ");
		int len = s.nextInt();
		int sortedArray[] = new int[len];
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < len; i++) {
			sortedArray[i] = s.nextInt();
		}
		System.out.println("Assuming the Enteres Array is printable and proceeding for the same.");
		System.out.println("Please enter the element to find the position:");
		int element = s.nextInt();
		int position = binarySearch(sortedArray, len, element);
		s.close();
		System.out.println("The position of required element is ::"+position);
	}

	public static int binarySearch(int arr[], int len, int element) {
		int startPosition = 0;
		int midPosition = len / 2;
		int lastPosition = len-1;
		if (arr[startPosition] <= element && arr[lastPosition] >= element) {
			do {
				if (element > arr[midPosition]) {
					startPosition = midPosition;
				} else if (element < arr[midPosition]) {
					lastPosition = midPosition;
				} else {
					return (midPosition+1);
				}
				midPosition = startPosition+(lastPosition-startPosition)/2;
			}while(lastPosition >= 0 && startPosition <= len);
		}
		else
		{
			return 0;
		}
		return 0;
	}
}
