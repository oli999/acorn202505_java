package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 *  1. MemberInfo 객체를 3개 생성해서 그 참조값을 m1, m2, m3 라는 변수에 각각 담아 보세요
		 *  
		 *  3 줄 코딩
		 *  
		 *  2. m1, m2, m3 에 들어 있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아 보세요.
		 *  
		 *  9 줄 코딩
		 *  
		 *  3. 각각의 객체가 가지고 있는 printData() 메소드를 호출해 보세요. 
		 *  
		 *  3 줄 코딩 
 		 */
		// 1. MemberInfo 객체를 3개 생성해서 m1, m2, m3 에 담기
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();

		// 2. 각 객체에 회원 정보 저장
		m1.num = 1;
		m1.name = "김철수";
		m1.addr = "서울";

		m2.num = 2;
		m2.name = "이영희";
		m2.addr = "부산";

		m3.num = 3;
		m3.name = "박민수";
		m3.addr = "대전";

		// 3. printData() 메소드 호출
		m1.printData();
		m2.printData();
		m3.printData();
		
	}
}
