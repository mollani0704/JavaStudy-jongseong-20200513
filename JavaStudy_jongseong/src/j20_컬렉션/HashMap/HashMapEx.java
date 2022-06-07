package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> studentsMap = new HashMap<Integer, String>();
		
		//값 추가
		studentsMap.put(20, "김준일");
		studentsMap.put(10, "김준이");
		studentsMap.put(22, "김준삼");
		studentsMap.put(30, "김준사");
		studentsMap.put(40, "김준오");
		
		System.out.println(studentsMap);
		
		//key로 value 가져오기
		System.out.println(studentsMap.get(10));
		
		// 수정
		studentsMap.put(10,  "김준육"); // put 같은 경우는 값이 없으면 추가가 됨
		studentsMap.replace(10, "김준칠"); // replace는 값이 없는 경우 값을 바꿀 수가 없다. 
		
		studentsMap.remove(10);
		
		Iterator<Integer> iterator = studentsMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentsMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentsMap.get(key));
//			}
			System.out.println(value);
		}
		
		//람다식(함수형 프로그램밍)
		studentsMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		System.out.println(studentsMap.containsKey(22));
		System.out.println(studentsMap.containsValue("김준구"));
	}
}
