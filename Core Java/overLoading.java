package coreJava;

//Method Overloading is a feature in Java (and other languages) where multiple methods can have the same name but differ in parameters (type, number, or order).
//It allows a class to perform different tasks using the same method name, improving code readability and reusability.

//class calculator{
//	int add(int a, int b) {
//		return a+b;
//	}
//	double add(int a, double b) {
//		return a+b;
//	}
//	float add(int a, float b) {
//		return a+b;
//	}
//	double add(double a, double b) {
//		return a+b;
//	}
//	float add(float a, int b) {
//		return a+b;
//	}
//	int add(int a, int b, int c ) {
//		return a+b+c;
//	}
//	float add(int a, float b, int c ) {
//		return a+b+c;
//	}
//	double add(double a, double b, double c ) {
//		return a+b+c;
//	}
//	float add(float a, float b, float c ) {
//		return a+b+c;
//	}
//	
//}
//
//public class overLoading {
//	public static void main(String[] args) {
//		int i = 10,j = 20,k = 30;
//		float l = 10.5f, m =20.5f, o = 30.5f;
//		double p = 100.5, q=200.5, r =300.5;
//		calculator calc = new calculator();
//		System.out.println(calc.add(i, j));
//		System.out.println(calc.add(k, r));
//		System.out.println(calc.add(i, j, k));
//		System.out.println(calc.add(k, o));
//	}
//}

public class overLoading {

    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(int radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
    	overLoading calc = new overLoading();

        System.out.println("Area of square: " + calc.area(4));
        System.out.println("Area of rectangle: " + calc.area(4.5, 3.0));
        System.out.println("Area of circle: " + calc.area(5));
    }
}

