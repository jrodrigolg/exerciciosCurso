package entities1;

public class Retangulo {
	public double width;
	public double height;
	
	public double area(double width, double height) {
		double area = width*height;
		return area;
	}
	
	public double perimeter(double width, double height) {
		double perimeter = width*2+height*2;
		return perimeter;
	}
	
	public double diagonal(double width, double height) {
		double diagonal = Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
		return diagonal;
	}
}
