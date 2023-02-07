package mission.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		
//		Pattern p1 = Pattern.compile("c[a-z]*");
//		
//		for (int i = 0; i < data.length; i++) {
//			Matcher m1 = p1.matcher(data[i]);
//			
//			if (m1.matches()) {
//				System.out.println("매칭된 문자 : " + data[i]);
//			}
//		}
		
//		String source1 = "ab?cd?ef?gh";
//		String reg1 = "(\\w*)";
//		
//		Pattern p2 = Pattern.compile(reg1);
//		Matcher m2 = p2.matcher(source1);
//		
//		while(m2.find()) {
//			System.out.println(m2.group());
//		}
		
		String source2 ="HP : 010-1111-1111, HOME : 02-222-2222";
		String reg2 = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		
		Pattern p3 = Pattern.compile(reg2);
		Matcher m3 = p3.matcher(source2);
		
		while(m3.find()) {
			System.out.println(m3.group());
		}
	}

}
