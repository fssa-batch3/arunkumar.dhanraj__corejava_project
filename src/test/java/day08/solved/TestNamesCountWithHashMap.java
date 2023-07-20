package day08.solved;

import java.util.Scanner;

import day08.practice.NamesCountWithHashMap;

public class TestNamesCountWithHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma seperated list of names");
		String str = scan.nextLine();
		scan.close();

		NamesCountWithHashMap names = new NamesCountWithHashMap();

		System.out.println("The count of the list of names");

		System.out.println(names.count(str));

	}

}
