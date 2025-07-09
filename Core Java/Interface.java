package coreJava;

//An interface in Java is a blueprint of a class that contains only abstract methods (by default) and static/final constants. 
//It is used to achieve abstraction and multiple inheritance in Java.




import java.util.Scanner;

//interface Calculator{
//	void add();
//	void sub();
//}
//
//class MyCalculator1 implements Calculator{
//	@Override
//	public void add() {
//		int a = 20;
//		int b = 30;
//		System.out.println("value  M1 of a+b : " + (a+b));
//	}
//	@Override
//	public void sub() {
//		int a = 200;
//		int b = 300;
//		System.out.println("value M1 of a-b : " + (a-b));
//	}
//}
//
//class MyCalculator2 implements Calculator{
//	@Override
//	public void add() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a M2ADD value of A : ");
//		int a = scan.nextInt();
//		System.out.println("Enter a M2ADD value of B : ");
//		int b = scan.nextInt();
//		System.out.println(a+b);
//	}
//	@Override
//	public void sub() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a M2SUB value of A : ");
//		int a = scan.nextInt();
//		System.out.println("Enter a M2SUB value of B : ");
//		int b = scan.nextInt();
//		
//		System.out.println(a-b);
//	}
//}
//
//class MyCalculator3 implements Calculator{
//	@Override
//	public void add() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a M3ADD value of A : ");
//		int a = scan.nextInt();
//		System.out.println("Enter a M3ADD value of B : ");
//		int b = scan.nextInt();
//		if(a==0 || b==0) {
//			System.out.println("Invalid Input");
//		}
//		else {
//			System.out.println(a+b);
//		}
//		
//	}
//	@Override
//	public void sub() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a M3SUB value of A : ");
//		int a = scan.nextInt();
//		System.out.println("Enter a M3SUB value of B : ");
//		int b = scan.nextInt();
//		if(a==0 || b==0) {
//			System.out.println("Inavlis Input");
//		}
//		else {
//			System.out.println(a-b);
//		}
//		
//	}
//}
//
//public class Interface {
//	   public static void main(String[] args) {
//		   MyCalculator1 mc1= new MyCalculator1();
//		   MyCalculator2 mc2 = new MyCalculator2();
//		   MyCalculator3 mc3 = new MyCalculator3();
//		   
//		   mc1.add();
//		   mc1.sub();
//		   mc2.add();
//		   mc2.sub();
//		   mc3.add();
//		   mc3.sub();
//	}
//}

//Functional interface has only one abstract method which hleps to override the ambigutiy problem.  
//FunctionalInterface program to achive Lamda Expression
//@FunctionalInterface
//interface Calculator {
//    int operate(int a, int b);  // Single abstract method
//}
//
//public class Interface {
//    public static void main(String[] args) {
//        
//        // Lambda expression implementing 'operate' method
//        Calculator add = (a, b) -> a + b;
//        Calculator sub = (a, b) -> a - b;
//        Calculator mul = (a, b) -> a * b;
//
//        System.out.println("Addition: " + add.operate(10, 5));
//        System.out.println("Subtraction: " + sub.operate(10, 5));
//        System.out.println("Multiplication: " + mul.operate(10, 5));
//    }
//}

