package coreJava;

//A constructor is a special method in a class that is automatically called when an object is created.
//It is used to initialize the object's variables and has the same name as the class, with no return type.

//class Customer{
//private int ID;
//private String Name;
//private long Num;
//private int Age;
//
//public Customer(int ID, String Name, long Num, int Age) {
//	this.ID = ID;
//	this.Name = Name;
//	this.Num = Num;
//	this.Age = Age;
//}
//public int getID() {
//	return ID;
//}
//public String getName() {
//	return Name;
//}
//public long getNum() {
//	return Num;
//}
//public int getAge() {
//	return Age;
//}
//}
//
//public class Constructor {
//public static void main(String[] args) {
//Customer cus = new Customer(7, "Dhoni", 070L, 43);
//System.out.println(cus.getID());
//System.out.println(cus.getName());
//System.out.println(cus.getAge());
//System.out.println(cus.getNum());
//}
//}


//Constructor overLading

//class Customer{
//private int ID;
//private String Name;
//private long Num;
//private int Age;
//
//	public Customer() {
//
//	ID = 18;
//	Name = "Kohli";
//	Num = 1818181818;
//	Age = 37;
//	
//}
//
//public Customer(int ID, String Name, long Num, int Age) {
//	this.ID = ID;
//	this.Name = Name;
//	this.Num = Num;
//	this.Age = Age;
//}
//public int getID() {
//	return ID;
//}
//public String getName() {
//	return Name;
//}
//public long getNum() {
//	return Num;
//}
//public int getAge() {
//	return Age;
//}
//}
//
//public class Constructor {
//public static void main(String[] args) {
//Customer cus1 = new Customer(7, "Dhoni", 07070707070L, 43);
//System.out.println(cus1.getID());
//System.out.println(cus1.getName());
//System.out.println(cus1.getAge());
//System.out.println(cus1.getNum());
//
//System.out.println("--------------------------");
//
//Customer cus2 = new Customer();
//System.out.println(cus2.getID());
//System.out.println(cus2.getName());
//System.out.println(cus2.getNum());
//System.out.println(cus2.getAge());
//}
//}


//CONSTRUCTOR CHANINING
//Constructor chaining is the process of calling one constructor from another within the same class
//using this() or from the parent class using super() to avoid code duplication and ensure proper initialization.


class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        this(10);  // Calls Child(int)
        System.out.println("Child default constructor");
    }

    Child(int a) {
        super();  // Calls Parent()
        System.out.println("Child parameterized constructor: " + a);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Child obj = new Child();  // Triggers the chain
    }
}



