package test.mypac;

public class Rect extends Shape{
	//사각형의 변의 길이를 저장할 필드
	private int width;
	
	public Rect(int x, int y, int width) {
		super(x, y);
		this.width=width;
	}
	public void printArea() {
		//사각형의 넓이
		double area=width*width;
		System.out.println("사각형의 넓이는:"+area);
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("한변의 길이:"+width);
	}
}
