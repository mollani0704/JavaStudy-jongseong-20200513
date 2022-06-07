package j20_컬렉션.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		
		name.add("김준일");
		name.add("김준이"); //set은 이 자체가 값이다. 만약 수정하고 싶으면 삭제하고 추가해야한다. 
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");

		System.out.println(name);
		
		Iterator<String> iterator = name.iterator();
		while(iterator.hasNext()) {
			String name2 = iterator.next(); 
			if(name2.equals("김준이")) {
				System.out.println(name2); 
			}
		}
		
		name.remove("김준사");
		System.out.println(name);
	
	}
}
