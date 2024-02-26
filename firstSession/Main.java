package firstSession;

import java.util.Scanner;
class Area {
	private double lenght;
	private double breadth;
	public void SetDim(double len,double brd) {
		lenght = len;
		breadth =  brd;
	}
		public double getArea() {
			return lenght*breadth;
		}
        }
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double len = 20,brd = 50;
		Area rectangle = new Area();
		System.out.println("enter the lenght of rectangle:");
		len = scanner.nextDouble();
		System.out.println("enter the breadth of rectangle:");
		rectangle.SetDim(len,brd);
		System.out.println("Area of the rectangle :" + rectangle.getArea());
		scanner.close();
	}
	}
