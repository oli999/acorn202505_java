package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  1. 한명의 회원정보를 MemberInfo 객체에 담아 보세요
		 *  ( 번호, 이름, 주소 는 본인 마음대로 설정해서 )
		 */
		MemberInfo m1=new MemberInfo();
		m1.num=10;
		m1.name="아무게";
		m1.addr="누구게";
		//2. 위에서 생성한 객체(MemberInfo) 의 printData() 메소드를 호출해 보세요.
		m1.printData();
	}
}
