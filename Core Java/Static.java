package coreJava;

import java.util.Scanner;

//The static keyword is used to create variables, methods, or blocks that belong to the class,
//rather than any specific object. It means they can be accessed without creating an instance of the class.

//class Test{
//	static int a,b;
//	static{
//		System.out.println("Inside static block");
//		a = 10;
//		b = 20;
//	}
//	static void fun1() {
//		System.out.println("Inside static method");
//	}
//	int x,y;
//	{
//	System.out.println("Inside Instance Bloack");
//	}
//	void fun2() {
//		System.out.println("Inside Instance method");
//	}
//	Test(){
//		System.out.println("Inside Constructor");
//		x = 30;
//		y = 40;
//		System.out.println(x + y);
//	}
//}
//public class Static {
//	public static void main(String[] args) {
//		Test.fun1();
//		Test t = new Test();
//		t.fun2();
//	}
//}

//class Bussiness{
//	private float si;
//	private float p;
//	private float t;
//	static private float r;
//	
//	static {
//		r = 15.2f;
//	}
//	
//	public void acceptInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the principle amount : ");
//		p = scan.nextFloat();
//		System.out.println("Enter the tenure : ");
//		t = scan.nextFloat();
//	}
//	
//	public void calcIntrest() {
//		si = (p*t*r)/100;
//	}
//	public void display() {
//		System.out.println(si);
//	}
//}
//
//class Static{
//	public static void main(String[] args) {
//		Bussiness B1 = new Bussiness();
//		B1.acceptInput();
//		B1.calcIntrest();
//		B1.display();
//	}
//}


import java.util.Scanner;

//import java.util.Scanner;
//
//class Business {
//    private float si;
//    private float p;
//    private float t;
//    static private float r;
//
//    static {
//        r = 15.2f;
//    }
//
//    public void acceptInput() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter principal amount: ");
//        p = scan.nextFloat();
//        System.out.print("Enter time (in years): ");
//        t = scan.nextFloat();
//    }
//
//    public void calcInterest() {
//        si = (p * t * r) / 100;
//    }
//
//    public void display() {
//        System.out.println("Simple Interest = " + si);
//    }
//}
//
//public class Static {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("How many users? ");
//        int n = scan.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("\n User " + i);
//            Business b = new Business();
//            b.acceptInput();
//            b.calcInterest();
//            b.display();
//        }
//
//        scan.close();
//    }
//}

import java.util.Scanner;

//class Bussiness {
//    private float si;
//    private float p;
//    private float t;
//    static private float r;
//
//    static {
//        r = 15.2f;
//    }
//
//    public void acceptInput(Scanner scan) {
//        System.out.println("Enter the principal amount: ");
//        p = scan.nextFloat();
//        System.out.println("Enter the tenure (in years): ");
//        t = scan.nextFloat();
//    }
//
//    public void calcInterest() {
//        si = (p * t * r) / 100;
//    }
//
//    public void display(int number) {
//        System.out.println("Business " + number + " - Simple Interest: " + si);
//    }
//}
//
//public class Static {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter number of businesses: ");
//        int n = scan.nextInt();
//
//        Bussiness[] businesses = new Bussiness[n];
//
//        for (int i = 0; i < n; i++) {
//            businesses[i] = new Bussiness();
//            System.out.println("\n--- Enter data for Business " + (i + 1) + " ---");
//            businesses[i].acceptInput(scan);
//            businesses[i].calcInterest();
//        }
//
//        System.out.println("\n--- Simple Interest Results ---");
//        for (int i = 0; i < n; i++) {
//            businesses[i].display(i + 1);
//        }
//
//        scan.close();
//    }
//}

//import java.util.Scanner;
//
//class Business {
//    private float si;
//    private float p;
//    private float t;
//    static private float r;
//
//    static {
//        r = 15.2f;
//    }
//
//    public void acceptInput(Scanner scan) {
//        System.out.print("Enter principal amount: ");
//        p = scan.nextFloat();
//        System.out.print("Enter time (in years): ");
//        t = scan.nextFloat();
//    }
//
//    public void calcInterest() {
//        si = (p * t * r) / 100;
//    }
//
//    public void display() {
//        System.out.println("Simple Interest = " + si);
//    }
//}
//
//public class Static {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("How many users? ");
//        int n = scan.nextInt();
//
//        Business[] list = new Business[n];
//
//        // Accept input and calculate interest
//        for (int i = 0; i < n; i++) {
//            list[i] = new Business();
//            System.out.println("\n--- User " + (i + 1) + " ---");
//            list[i].acceptInput(scan);
//            list[i].calcInterest();
//        }
//
//        // Display using for-each loop
//        System.out.println("\n--- Results ---");
//        for (Business b : list) {
//            b.display();
//        }
//
//        scan.close();
//    }
//}





