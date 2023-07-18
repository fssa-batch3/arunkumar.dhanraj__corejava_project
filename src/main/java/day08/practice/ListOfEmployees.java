package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class ListOfEmployees {
	
	public HashMap<String, String> list(String str) {

		String[] arr = str.split(",");

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < arr.length; i+=2) {
			String element = arr[i];
		
			if (map.containsKey(element)) {
				String s = map.get(element);
				map.replace(element, s+","+arr[i+1]);

			} else {
				map.put(element, arr[i+1]);
			
			}

		}

		return map;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma separated list of DeptName, EmployeeName");
		String str = scan.nextLine();
		scan.close();

		ListOfEmployees names = new ListOfEmployees();

		System.out.println("The list of employees");

		System.out.println(names.list(str));

	}

}
