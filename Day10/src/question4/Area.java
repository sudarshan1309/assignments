package question4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int rect = (length*breadth);
		return rect;
	}

	
	@Override
	public int squareArea(int side) {
		int sqr= (side*side);
		return sqr;
	}

	@Override
	public int circleArea(int radius) {
		int cir = ((22/7)*(radius*radius));
		return cir;
	}

}
