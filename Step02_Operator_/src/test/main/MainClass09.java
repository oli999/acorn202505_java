package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  1~100 사이의 숫자 중에서 짝수의 총합을 구해서 출력하는 프로그래밍을 해 보세요.
		 */
		
		int sum=0;
		for(int i=1; i<=100; i++ ) {
			// i 는 1,2,3,4,5 ... 99, 100
			//만일 i 를 2로 나눈 나머지가 0 이라면 ( i 가 짝수라면 )
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
		sum=0;
		// i 를 2, 4, 6, 8, 10 ... 98, 100 으로 변하게 for 문을 구성할수 있을까?
		for(int i=2; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
	}
}









