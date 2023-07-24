package weeklyAssesment;

import java.util.*;


public class CoreJavaTest {
	
	 static String departwiseSortedPrinting(List<String> departmentNameList) {
	        // Validation
	        StringBuilder outputString = new StringBuilder("");
	        HashMap<String, TreeSet<String>> deptEmp = new HashMap<>();

	     
	            for (String sourceLine : departmentNameList) {
	                String[] keyValuePair = sourceLine.split(",");
	                if (deptEmp.containsKey(keyValuePair[0])) {
	                    TreeSet<String> empNameSet = deptEmp.get(keyValuePair[0]);
	                    empNameSet.add(keyValuePair[1]);
	                } else {
	                    TreeSet<String> empNameSet = new TreeSet<>();
	                    empNameSet.add(keyValuePair[1]);
	                    deptEmp.put(keyValuePair[0], empNameSet);
	                }
	            }
	        

	        Set<String> deptKeySet = deptEmp.keySet();
	        for (String dept : deptKeySet) {
	            outputString.append(dept);
	            outputString.append(": ");
	            outputString.append(deptEmp.get(dept));
	            outputString.append("\n");
	        }
	        return outputString.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int numOfLines = sc.nextInt();
	        sc.nextLine();
	        List<String> inputLines = new ArrayList<String>(numOfLines);

	        for (int i = 0; i < numOfLines; i++) {
	            inputLines.add(sc.nextLine());
	        }

	        sc.close();
	        System.out.println(departwiseSortedPrinting(inputLines));
	    }



}





   