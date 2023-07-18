package day07.practice;

import java.util.*;

public class NumbersWithDuplicateEntries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Enter the numbers to be stored in an Array");
		for(int i=0;i<10;i++) {
			arr.add(scan.nextInt());
		}
		scan.close();
		
		System.out.println("Array with Duplicates = " + arr);
		
		HashSet <Integer> removedDup = new HashSet<>(arr); 
		
		System.out.println("Array after removing Duplicates = "+removedDup);
		
		
		
	}

}
