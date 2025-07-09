package coreJava;

import java.util.Scanner;

//Abstraction is the concept of hiding internal details and showing only essential features to the user.
//It simplifies complexity by focusing on what an object does instead of how it does it.

//Abstraction means Imcomplete 

// It can contain both abstract methods and concrete methods.
//void demo() >> Method Signature
// void demo(){ } >> Method Body.
//________________________________________________________________________

//abstract class Plane{
//	abstract void takeoff();
//	abstract void fly();
//	abstract void land();
//}
//
//class CargoPlane extends Plane{
//	void takeoff() {
//		System.out.println("CargoPlane is TakingOff");
//	}
//	void fly() {
//		System.out.println("CargoPlane is Flying at Low Height");
//	}
//	void land() {
//		System.out.println("CargoPlane is Landing");
//	}
//	
//}
//
//class PassengerPlane extends Plane{
//	void takeoff() {
//		System.out.println("PassengerPlane is TakingOff");
//	}
//	void fly() {
//		System.out.println("PassengerPlane is Flying at Medium Height");
//	}
//	void land() {
//		System.out.println("PassengerPlane is Landing");
//	}
//	
//}
//
//class FighterPlane extends Plane{
//	void takeoff() {
//		System.out.println("FighterPlane is TakingOff");
//	}
//	void fly() {
//		System.out.println("FighterPlane is Flying at High Height");
//	}
//	void land() {
//		System.out.println("FighterPlane is Landing");
//	}
//	
//}
//
//class Airport{
//	static void permit(Plane ref) {
//		ref.takeoff();
//		ref.fly();
//		ref.land();
//	}
//}
//
//
//public class Abstraction {
//	public static void main(String[] args) {
//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp  = new PassengerPlane();
//		FighterPlane fp = new FighterPlane();
//		
//		Airport.permit(fp);
//		Airport.permit(pp);
//		Airport.permit(cp);
//	}
//}


//abstract class Kingdom{
//	abstract void son1();
//	abstract void son2();
//	abstract void son3();
//}
//
//class Block1 extends Kingdom{
//	@Override
//	void son1() {
//		System.out.println("Son1 has taken the Block1 property");
//	}
//	@Override
//	void son2() {
//		System.out.println("Son2 was ready to take Block2 ");
//	}
//	@Override
//	void son3() {
//		System.out.println("Son3 was ready to take Block3 ");
//	}	
//}
//
//class Block2 extends Kingdom{
//	@Override
//	void son1() {
//		System.out.println("Son2 has taken the Block2 property");
//	}
//	@Override
//	void son2() {
//		System.out.println("Son1 was already taken Block1 ");
//	}
//	@Override
//	void son3() {
//		System.out.println("Son3 was ready to take Block3 ");
//	}	
//}
//
//class Block3 extends Kingdom{
//	@Override
//	void son3() {
//		System.out.println("Son3 has taken the Block1 property");
//	}
//	@Override
//	void son2() {
//		System.out.println("Son2 was already taken Block2 ");
//	}
//	@Override
//	void son1() {
//		System.out.println("Son1 was already taken Block1 ");
//	}	
//}
//
//class King{
//	  static void authority(Kingdom ref) {
//		  ref.son1();
//		  ref.son2();
//		  ref.son3();
//	  }
//}
//
//class Abstraction{
//	public static void main(String[] args) {
//		Block1 b1 = new Block1();
//		Block2 b2 = new Block2();
//		Block3 b3 = new Block3();
//		
//		King.authority(b1);
//		King.authority(b2);
//		King.authority(b3);
//	}
//	
//}


//Below Code on using the OOps Properties

abstract class Shape{
	float area;
	
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea() {
		System.out.println(area);
	}
}

class Square extends Shape{
	private float side;
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a side : ");
		side = scan.nextFloat();
	}
	@Override
	public void calcArea() {
		area = side * side;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		length = scan.nextFloat();
		System.out.println("Enter the Breadth : ");
		breadth = scan.nextFloat();
	}
	@Override
	public void calcArea(){
		area = length*breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		radius = scan.nextFloat();
	}
	@Override
	public void calcArea(){
		area = 3.14f*radius*radius;
	}
}

class Geomentry{
	public void permit(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}

class Abstraction{
	  public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geomentry g = new Geomentry();
		g.permit(s);
		g.permit(c);
		g.permit(r);
	}
}