package day09.practice;

import java.util.*;

public class SortAList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many integers do you want to put?");
		int n = scan.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + " number:");
			arr.add(scan.nextInt());

		}
		scan.close();
		
		System.out.println("Unsorted Array: " + arr);

		Collections.sort(arr);

		System.out.println("Sorted Array: " + arr);

	}

}
