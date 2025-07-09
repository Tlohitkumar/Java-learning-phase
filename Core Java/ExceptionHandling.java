package coreJava;
import java.util.*;
//public class ExceptionHandling {
//	public static void main(String[] args) {
//		System.out.println("Connection is Established");
//		Scanner scan = new Scanner(System.in); 
//		
//		try {
//			System.out.println("Enter a numerator : ");
//			int a = scan.nextInt();
//			
//			System.out.println("Enter a Denominator : ");
//			int b = scan.nextInt();
//			
//			int c = a/b;
//			System.out.println("The value of c : " + c);
//			
//			System.out.println("Enter the size of array : ");
//			int size = scan.nextInt();
//			int[] arr = new int[size];
//			
//			System.out.println("Enter the elements to be stored : ");
//			int element = scan.nextInt();
//			
//			System.out.println("Enteer the index at which element must be stored : ");
//			int index = scan.nextInt();
//			
//			arr[index] = element;
//			System.out.println(arr[index]);
//			
//		}
//		catch(Exception e) {
//			System.out.println("Invalid Input");
//		}
//		System.out.println("Connection Terminated");
//	}
//
//}

//Stack Overflow condition 
//This occurs when us no space to push a new stack frame insidethe stack.
//The method fun1() uses infinite recursion without a base case, causing continuous method calls. 
////This leads to a StackOverflowError as the call stack memory gets exhausted.
//class demo{
//	void fun1() {
//		fun1();
//	}
//}
//class ExceptionHandling{
//	public static void main(String[] args) {
//		demo d = new demo();
//		d.fun1();
//	}
//}


////Case 1 : Handling the exceptions
//
//class Demo1{
//	void fun1() {
//		System.out.println("Connection 2 is Estd");
//		Scanner scan = new Scanner(System.in);
//		try {
//			System.out.println("Enter the numerator : "); //100
//			int a = scan.nextInt();
//			System.out.println("Enter the denominator : "); //0
//			int b = scan.nextInt();
//															
//			int c = a/b;
//			System.out.println("the value of c is : " + c);
//			
//		}
//		catch (Exception e) {
//			  System.out.println("Excpetion handled in fun1()");
//		}
//		System.out.println("Connection2 is terminated");
//	}
//}
//
//class ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//		Demo1 d = new Demo1();
//		d.fun1();
//		System.out.println("Connection1 is terminated");
//		
//	}
//}

//__________________________________________________________________________________________________________

////Case 2 : Re-Throwing the Exception(try-catch-throw-throws-finally)
//
//class Demo1{
//	void fun1() throws Exception{
//		
//		System.out.println("Connection2 is Estd");
//		Scanner scan = new Scanner(System.in);
//		try {
//			System.out.println("Enter the numerator : "); //100
//			int a = scan.nextInt();
//			System.out.println("Enter the denominator : "); //0
//			int b = scan.nextInt();
//															
//			int c = a/b;
//			System.out.println("the value of c is : " + c);
//			
//			
//		} catch (Exception e) {
//			System.out.println("Excpetion handled in fun1()");
//			throw e;
//		}
//		finally {          //At any cost this statment should be get print. 
//			System.out.println("Connection2 is terminated");
//		}
//		
//	}
//}
//class  ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//													//Demo1 d1 = new Demo1(); d1.fun1(); 
//													//It show error because we are rethrowing the exception from demo class to main method.
//													//Then Exception will caught in main method as shown below
//
//		try {
//			Demo1 d1 = new Demo1();
//			d1.fun1();
//		} catch (Exception e) {
//			System.out.println("Exception handled in main");
//		}
//		System.out.println("Connection1 is Terminated");
//		
//	}
//}

//__________________________________________________________________________________________________________

////Case3 : Duckling the Exception
//
////In this process the excpetion handling will be done in main method.
////Note >> If we want to throw the exception from the method to main, we use throw e, if throw used then definitly THROWS should used.
////Note >> If to throw the exception directly to main method. Then only Throws sholud be used no need to include the try block and throw also.
//
////If Throw used then Throws should be there
////if Throws used no need of Throw 
//
//class Demo1{
//void fun1() throws Exception{
//	
//	System.out.println("Connection2 is Estd");
//	Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the numerator : "); //100
//		int a = scan.nextInt();
//		System.out.println("Enter the denominator : "); //0
//		int b = scan.nextInt();
//														
//		int c = a/b;
//		System.out.println("the value of c is : " + c);
//		System.out.println("Exception handled in fun()1");
//		System.out.println("Connection2 is terminated");
//	}
//}
//		
//class ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//		try {
//			Demo1 d1 = new Demo1();
//			d1.fun1();
//		} catch (Exception e) {
//			System.out.println("Exception handled in main()");
//		}
//		System.out.println("Connection1 is terminated");
//	}
//}

//________________________________________________________________________________________________________________

//Print Stack Trace
//This shows the detailed error message and line number where the exception happened — very useful for debugging.
//class demo{
//	void fun1() {
//		System.out.println("Connection2 is Estd");
//		try {
//			int a = 100;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Connection2 is terminated");
//	}
//}
//class  ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//		demo d = new demo();
//		d.fun1();
//		System.out.println("Connection1 is terminated");
//	}
//}
//__________________________________________________________________________________

//getMessage
//
//class demo{
//	void fun1() {
//		System.out.println("Connection2 is Estd");
//		try {
//			int a = 100;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			e.getMessage();
//		}
//		System.out.println("Connection2 is terminated");
//	}
//}
//class  ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//		demo d = new demo();
//		d.fun1();
//		System.out.println("Connection1 is terminated");
//	}
//}
//_____________________________________________________________________________________

////If we print exception e 
//class demo{
//	void fun1() {
//		System.out.println("Connection2 is Estd");
//		try {
//			int a = 100;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Connection2 is terminated");
//	}
//}
//class  ExceptionHandling{
//	public static void main(String[] args) {
//		System.out.println("Connection1 is Estd");
//		demo d = new demo();
//		d.fun1();
//		System.out.println("Connection1 is terminated");
//	}
//}

//_____________________________________________________________________________

//CUSTOM EXCEPTIONS

//class InvalidUserException extends Exception{
//	@Override
//	public String getMessage() {
//		return "Invalid card details.Try again";
//	}
//}
//
//class ATM{
//	private int accNum = 12345;
//	private int pin = 9999;
//	private int an;
//	private int pwd;
//	
//	public void acceptInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter account Number : ");
//		an = scan.nextInt();
//		System.out.println("Enter a pin : ");
//		pwd = scan.nextInt();
//	}
//	public void validate() throws InvalidUserException{
//		if(accNum == an && pin == pwd) {
//			System.out.println("Collect your Money");
//		}
//		else {
//			InvalidUserException iue = new InvalidUserException();
//			System.out.println(iue.getMessage());
//			throw iue;
//		}
//	}
//}
//
//class Bank{
//	public void initiate() {
//		ATM atm = new ATM();
//		try {
//			atm.acceptInput();
//			atm.validate();
//			
//		} catch (Exception e) {
//			try {
//				atm.acceptInput();
//				atm.validate();
//			} catch (Exception e2) {
//				System.out.println("Card is blocked");
//			}
//		}
//	}
//}
//
//class ExceptionHandling{
//	public static void main(String[] args) {
//		Bank b = new Bank();
//		b.initiate();
//	}
//}

//__________________________________________________________________________

//class UnderAgeException extends Exception{
//	@Override
//	public String getMessage() {
//		return "You are too Young.Poo ra Bachaa!";
//	}
//}
//class OverAgeException extends Exception{
//	@Override
//	public String getMessage() {
//		return "You are old. Challa Paddu Babaii!";
//	}
//}
//
//class Applicant{
//	private int age;
//	
//	public void acceptInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your age : ");
//		age = scan.nextInt();
//	}
//	
//	public void validate() throws UnderAgeException, OverAgeException{
//		if(age >=18 && age <=60) {
//			System.out.println("Collect your License");
//		}
//		else if (age<18) {
//			UnderAgeException uae = new UnderAgeException();
//			System.out.println(uae.getMessage());
//			throw uae;
//		}
//		else{
//			OverAgeException oae = new OverAgeException();
//			System.out.println(oae.getMessage());
//			throw oae;
//		}
//	}
//}
//
//class RTO{
//	public void acceptApplicant() {
//		Applicant a = new Applicant();
//		try {
//			a.acceptInput();
//			a.validate();
//		} catch (Exception e) {
//			try {
//				a.acceptInput();
//				a.validate();
//			} catch (Exception f) {
//				System.out.println("Apply again in 15days");
//			}
//		}
//	}
//}
//
//class ExceptionHandling{
//	public static void main(String[] args) {
//		RTO r = new RTO();
//		r.acceptApplicant();
//	}
//}


//ToString() >> will be inherited from the object in method to override hash code

//Without using of toString, if we call the reference of object it shows the hashcode of the obeject


//class Collage{
//	private int id;
//	private String name;
//	private String email;
//	private int age;
//	
//	public Collage() {
//		
//	}
//	
//	public Collage(int id, String name, String email, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email =email;
//		this.age = age;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	@Override
//	public String toString() {
//		return id+ " "+name+" "+email+" "+age;
//	}
//	
//}
//
//public class ExceptionHandling{
//	public static void main(String[] args) {
//		Collage c = new Collage(1,"tim", "timios@gmail.com", 45);
////		c.setId(18);
////		c.setName("lohit");
////		c.setAge(24);
////		c.setEmail("Lohitthotakura@gamil.com");
////		System.out.println(c.getAge()+" " + c.getId()+ " " + c.getName() + " " + c.getEmail());
//		System.out.println(c);
//	}
//}