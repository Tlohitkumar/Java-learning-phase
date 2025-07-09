package coreJava;

//Polymorphism means the ability of an object to take many forms, 
//allowing the same method to behave differently based on the object that calls it
//Usually achieved through method overriding and dynamic method dispatch.
//Adavntages Code reuseability, Flexibility, Reduction in Complexity



//class Plane{
//	void fly() {
//		System.out.println("Plane is Flying");
//	}
//}
//class CargoPlane extends Plane{
//	void fly() {
//		System.out.println("CargoPlane is Flying at Low Height");
//	}
//	void carryCargo() {
//		System.out.println("CargoPlane is Carrying Crago");
//	}
//}
//class PassengerPlane extends Plane{
//	void fly() {
//		System.out.println("PassengerPlane is Flying at Medium Height");
//	}
//	void carryPassengers() {
//		System.out.println("PassengerPlane is get HighJcaked");
//	}
//}
//class FighterJet extends Plane{
//	void fly() {
//		System.out.println("FighterJet is Flying at Height");
//	}
//	void carryWeapons() {
//		System.out.println("FighterJet Carrying FatBoy");
//	}
//}
//
//public class Polymorphism {
//	public static void main(String[] args) {
//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		FighterJet fj = new FighterJet();
//		
//		//Achiving ploymorphism by loose coupling
//		
//		Plane ref;
//		ref = cp;
//		ref.fly();
////		ref.carryCargo(); //This is case where Specialized method can not be accesssed by loose coupling, we have to call with object if needed
//		
//		//Implemening Down Casting like parent object reference to child ref (Hight to Low)
//		
//		((CargoPlane)ref).carryCargo();
//		
//		ref = pp;
//		ref.fly();
//		((PassengerPlane)ref).carryPassengers();
//		
//		ref = fj;
//		ref.fly();
//		((FighterJet)ref).carryWeapons();
//	}
//}


//class Plane{
//	void TakeOff() {
//		System.out.println("Plane is Takeoff");
//	}
//	void Fly() {
//		System.out.println("Plane is Flying");
//	}
//	void Land() {
//		System.out.println("Plane is Landed");
//	}
//}
//
//class CargoPlane extends Plane{
//	void Fly() {
//		System.out.println("CargoPlane is Flying at Low Height");
//	}
//}
//class PassengerPlane extends Plane{
//	void Fly() {
//		System.out.println("PassengerPlane is Flying at Low Height");
//	}
//}
//class FighterPlane extends Plane{
//	void Fly() {
//		System.out.println("FighterPlane is Flying at Low Height");
//	}
//}
//
//public class Polymorphism{
//	public static void main(String[] args) {
//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		FighterPlane fp = new FighterPlane();
//		
//		
//		Plane ref;
//		ref = cp;
//		ref.Fly();
//		ref.TakeOff();
//		ref.Land();
//		
//		ref = pp;
//		ref.Fly();
//		ref.Land();
//		ref.TakeOff();
//		
//		ref = fp;
//		ref.Fly();
//		ref.TakeOff();
//		ref.Land();
		
		//By ^^ above process can achive polumorphism but can not achive advabtage of polymorphism,
		
		//Now to achive advatages of polymorphism
		
//		class Airport{
//			void permit(Plane ref) {
//				ref.TakeOff();
//				ref.Fly();
//				ref.Land();
//			}
//		}
//		Airport ap = new Airport();
//		ap.permit(cp);
//		ap.permit(fp);
//		ap.permit(pp);
//	}
//}


//hasA proble using 

class Heart{
	private int weight;
	private int bpm;
	
	Heart(int weight, int bpm){
		this.weight = weight;
		this.bpm = bpm;
	}
	int getWeight() {
		return weight;
	}
	int getBpm() {
		return bpm;
		
	}
}

class Brain{
	private int weight;
	private String colour;
	
	Brain(int weight, String colour){
		this.weight = weight;
		this.colour = colour;
	}
	int getWeight() {
		return weight;
	}
	String getColour() {
		return colour;
	}
}

class Bike{
	private String brand;
	private int milage;
	
	public Bike(String brand, int milage) {
		this.brand = brand;
		this.milage = milage;
	}
	String getBrand() {
		return brand;
	}
	int getMilage() {
		return milage;
	}
}

class Book{
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	String getName() {
		return name;
	}
	String getAuthor() {
		return author;
	}
}

class Student{
	Heart h = new  Heart(289, 18);
	Brain b = new  Brain(1400, "grey");
	
	void hasA(Book book) {
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
	}
	
	void hasA(Bike bike) {
		System.out.println(bike.getBrand());
		System.out.println(bike.getMilage());
	}
}

class Polymorphism{
	public static void main(String[] args) {
		Student s = new Student();
		Bike bi = new Bike("R15", 43);
		Book b0 = new Book("Java", "JG");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColour());
		s.hasA(bi);
		s.hasA(b0);
		
		s = null;
		
		System.out.println(bi.getBrand());
		System.out.println(bi.getMilage());
		System.out.println(b0.getName());
		System.out.println(b0.getAuthor());
	}
}