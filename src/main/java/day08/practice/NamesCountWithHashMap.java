package day08.practice;

import java.util.*;

public class NamesCountWithHashMap {

	public HashMap<String, Integer> count(String str) {

		String[] arr = str.split(",");

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			String element = arr[i];
			int count = 1;
			if (Character.isLowerCase(element.charAt(0))) {
				element = Character.toUpperCase(element.charAt(0)) + element.substring(1);
			}
			if (map.containsKey(element)) {
				int l = map.get(element);
				l++;
				map.replace(element, l);

			} else {
				map.put(element, count);
			}

		}

		return map;
	}

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
