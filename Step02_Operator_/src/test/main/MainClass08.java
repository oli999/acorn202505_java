package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  for 문을 이용해서 
		 *  
		 *  1 + 2 + 3 + 4 ... + 99 + 100 
		 *  
		 *  의 총합을 콘솔창에 출력하는 프로그래밍을 해 보세요.
		 *  hint : += 연산자를 활용해 보세요.
		 */
		int sum=0;
		for(int i=0; i<100; i++) {
			//sum = sum+i+1;
			// i 는 0, 1, 2, 3, 4 ... 98, 99 로 변한다 
			// sum 에 대입되는 값은 원래 있는 값에서 1, 2, 3, 4, 5, ... 99, 100 을 더한값이 대입된다. 
			sum += i+1; // i에 1을 더한값을 sum 이라는 변수에 누적 시키기 
		}
		System.out.println("1~100 까지 총합:"+sum);
		//sum 은 0 으로 다시 초기화 
		sum=0;
		for(int i=1; i<=100; i++) {
			sum += i; // i값을 sum 이라는 변수에 누적 시키기
		}
		System.out.println("1~100 까지 총합:"+sum);
	}
}









