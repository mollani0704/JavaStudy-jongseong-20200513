package 컬렉션복습.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		strArrayList.add("b7");
		
		System.out.println(strArrayList.size());
		
		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		strArrayList.forEach(r -> {System.out.println(r);});
	}
}
