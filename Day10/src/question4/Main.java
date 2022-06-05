package question4;

public class Main {

	public static void main(String[] args) {
		Area a = new Area();
		int rect = a.rectangleArea(4, 5);
		int sqr = a.squareArea(4);
		int cir = a.circleArea(7);
		
		
		System.out.println("Area of Rectangle = "+rect);
		System.out.println("Area of Square = "+sqr);
		System.out.println("Area of Circle = "+cir);
	}

}
