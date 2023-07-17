package day06.practice;

import java.util.*;

public class RemoveDuplicateInArrayList {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List <String> newCity = new ArrayList<String>();
		
		for(int i=0;i<cityList.size();i++) {
			boolean check = true;
			for(int j=i;j<cityList.size();j++) {
				if(i!=j && cityList.get(i).equals(cityList.get(j))) {
					check = false;
				}
			}
			if(check) {
				newCity.add(cityList.get(i));
			}
		}
		
		System.out.println(newCity);

	}

}
