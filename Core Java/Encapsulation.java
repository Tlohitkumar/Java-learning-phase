package coreJava;

//Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) and restricting direct access to them.
//It helps protect the data by using private access and allows controlled access using getter and setter methods.

//class Customers{
//	private int ID;
//	private String Name;
//	private long Num;
//	private int Age;
//	
//	public int getID() {
//		return ID;
//	}
//
//	public void setID(int iD) {
//		ID = iD;
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	public void setName(String name) {
//		Name = name;
//	}
//
//	public long getNum() {
//		return Num;
//	}
//
//	public void setNum(long num) {
//		Num = num;
//	}
//
//	public int getAge() {
//		return Age;
//	}
//
//	public void setAge(int age) {
//		Age = age;
//	}
//}
//
//public class Encapsulation {
//public static void main(String[] args) {
//	Customers cus = new Customers();
//	cus.setID(7);
//	cus.setName("Dhoni");
//	cus.setAge(43);
//	cus.setNum(070);
//	System.out.println(cus.getID());
//	System.out.println(cus.getName());
//	System.out.println(cus.getAge());
//	System.out.println(cus.getNum());
//}
//}


//class Mobile{
//	private String Brand;
//	private String Model;
//	private int Stock;
//	private String Country;
//	
//	public void setBrand(String Brand) {
//		this.Brand = Brand;
//	}
//	public void setModel(String Model) {
//		this.Model = Model;
//	}
//	public void setStock(int Stock) {
//		this.Stock = Stock;
//	}
//	public void setCountry(String Country) {
//		this.Country = Country;
//	}
//	
//	public String getBrand() {
//		return Brand;
//	}
//	public String getModel() {
//		return Model;
//	}
//	public int getStock() {
//		return Stock;
//	}
//	public String getCountry() {
//		return Country;
//	}
//	
//}
//
//class Encapsulation{
//	public static void main(String[] args) {
//		Mobile m = new Mobile();
//		m.setBrand("Apple");
//		m.setModel("IOS17");
//		m.setStock(25);
//		m.setCountry("INDIA");
//		
//		System.out.println(m.getBrand());
//		System.out.println(m.getCountry());
//		System.out.println(m.getStock());
//		System.out.println(m.getModel());
//	}
//}


//class Mobile{
//	private String Brand;
//	private String Model;
//	private int Stock;
//	private String Country;
//
//	public void setData(String Brand, String Model, int Stock, String Country) {
//		this.Brand = Brand;
//		this.Model = Model;
//		this.Stock = Stock;
//		this.Country = Country;
//	}
//	
//	public String getBrand() {
//		return Brand;
//	}
//	public String getModel() {
//		return Model;
//	}
//	public int getStock() {
//		return Stock;
//	}
//	public String getCountry() {
//		return Country;
//	}
//	
//}
//
//class Encapsulation{
//	public static void main(String[] args) {
//		Mobile m = new Mobile();
//		m.setData("Apple", "IOS17", 25, "INDIA");
//		
//		System.out.println(m.getBrand());
//		System.out.println(m.getCountry());
//		System.out.println(m.getStock());
//		System.out.println(m.getModel());
//	}
//}

import java.util.Scanner;

//class Mobile {
//    private String Brand;
//    private String Model;
//    private int Stock;
//    private String Country;
//
//    public void setData(String Brand, String Model, int Stock, String Country) {
//        this.Brand = Brand;
//        this.Model = Model;
//        this.Stock = Stock;
//        this.Country = Country;
//    }
//
//    public String getBrand() {
//        return Brand;
//    }
//
//    public String getModel() {
//        return Model;
//    }
//
//    public int getStock() {
//        return Stock;
//    }
//
//    public String getCountry() {
//        return Country;
//    }
//}
//
//class Encapsulation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of mobiles: ");
//        int n = sc.nextInt();
//        sc.nextLine(); // consume leftover newline
//
//        Mobile[] mobiles = new Mobile[n];
//
//        for (int i = 0; i < n; i++) {
//            mobiles[i] = new Mobile();
//            System.out.println("\nEnter details for Mobile " + (i + 1) + ":");
//            System.out.print("Brand: ");
//            String brand = sc.nextLine();
//            System.out.print("Model: ");
//            String model = sc.nextLine();
//            System.out.print("Stock: ");
//            int stock = sc.nextInt();
//            sc.nextLine(); // consume leftover newline
//            System.out.print("Country: ");
//            String country = sc.nextLine();
//
//            mobiles[i].setData(brand, model, stock, country);
//        }
//
//        System.out.println("\nMobile Details:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Mobile " + (i + 1) + ": " +
//                mobiles[i].getBrand() + ", " +
//                mobiles[i].getModel() + ", Stock: " +
//                mobiles[i].getStock() + ", Country: " +
//                mobiles[i].getCountry());
//        }
//
//        sc.close();
//    }
//}
