package day08.Hots;

import java.util.*;

public class OwnHashMap {

	public HashMap<String, String> hashMap(String str1, String str2, String str3) {
		String[] phase1 = str1.split(",");
		String[] phase2 = str2.split(",");
		String[] phase3 = str3.split(",");

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < phase1.length; i++) {
			String str = phase1[i];
			if (map.containsKey("Phase 1")) {
				str = map.get("Phase 1");
				str +=","+ phase1[i] ;
			}

			map.put("Phase 1", str);

		}
		for (int i = 0; i < phase2.length; i++) {
			String str = phase2[i];
			if (map.containsKey("Phase 2")) {
				str = map.get("Phase 2");
				str += ","+phase2[i] ;
			}

			map.put("Phase 2", str);

		}

		for (int i = 0; i < phase3.length; i++) {
			String str = phase3[i];
			if (map.containsKey("Phase 3")) {
				str = map.get("Phase 3");
				str += ","+phase3[i] ;
			}

			map.put("Phase 3", str);

		}
		return map;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter comma separated list of phase 1 movies of Marvel");
		String phase1 = scan.nextLine();

		System.out.println("Enter comma separated list of phase 2 movies of Marvel");
		String phase2 = scan.nextLine();

		System.out.println("Enter comma separated list of phase 3 movies of Marvel");
		String phase3 = scan.nextLine();

		scan.close();

		OwnHashMap hash = new OwnHashMap();
		
		
		HashMap<String, String> map = hash.hashMap(phase1, phase2, phase3);
		
		map.forEach((key,value)->System.out.println(key+": "+value));

	}

}
