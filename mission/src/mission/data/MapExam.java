package mission.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map : (key, value) => HashMap
		Map<String, String> map = 
				new HashMap<String, String>();
		
		map.put("1", "SSG");
		map.put("2", "키움");
		map.put("3", "LG");

		System.out.println("요소의 사이즈 : " + map.size());
		
		if (map.containsValue("SSG")) {
			map.remove("1");
		}
		
//		System.out.println("요소의 사이즈 : " + map.size());
//		System.out.println("value : " + map.get("3"));
		
		// Map 전체 목록 출력(key, value)
		// Map => Set => Iterator
		// key-> keySet() : 키 값만 추출
		// value -> values() : 리턴 값 Collection
		// (key, value) -> entrySet() : key, value 모두 추출
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();
			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}

	}

}
