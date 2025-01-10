package listSample;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
	
	public static void main(String[] args) {
	
		// 리스트 배열
		List<String> names = new ArrayList<>();
		
		// 리스트 추가
		names.add("홍길동");
		names.add("이춘향");
		names.add("James");
		
		// 리스트 출력
		for (String name: names) {
			System.out.println(name);
		}
	}
}
