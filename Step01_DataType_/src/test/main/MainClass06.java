package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//String type 의 기능(메소드) 사용해 보기
		
		String str="abcd1234";
		//문자열의 길이를 리턴하는 length() 메소드 사용해 보기
		int length=str.length();
		//문자열을 대문자로 변경해서 리턴하는 메소드 사용
		String upper=str.toUpperCase();
		//특정 문자열이 포함 되어 있는지 여부를 리턴하는 메소드 사용
		boolean contains=str.contains("cd");
	}
}
