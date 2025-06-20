package test.main;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//c1 은 null 이다 
		Car c1=MyUtil.car;
		//Car 객체를 생성해서 MyUtil 클래스의 car 라는 필드에 담기
		MyUtil.car = new Car();
		//c1 은 위에서 생성한 Car 객체의 참조값이 들어 있다.
		Car c2 = MyUtil.car;
		c2.drive();
		// MyUtil클래스의 car 라는 필드를 직접 참조해서 drive() 메소드를 호출할수도 있다.
		MyUtil.car.drive();
		
		PrintStream p=System.out;
		p.println("xxx");
	}
}









