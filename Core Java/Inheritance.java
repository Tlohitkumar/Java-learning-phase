package coreJava;

//Inheritance is a mechanism where one class (child/subclass) can acquire the properties and 
//methods of another class (parent/superclass), allowing code reusability and hierarchical classification.


////1. Single Inheritance
////One subclass inherits from one superclass.
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Inheritance {
//public static void main(String[] args) {
//	Animal a = new Animal();
//	a.sound();
//	Dog  d = new Dog();
//	d.bark();
//}
//}

////2. Multilevel Inheritance
////A class inherits from a class which is already a subclass of another.
//
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Puppy extends Dog {
//    void weep() {
//        System.out.println("Puppy weeps");
//    }
//}
//class Inheritance{
//	public static void main(String[] args) {
//		Animal a = new Animal();
//		Dog d = new Dog();
//		Puppy p = new Puppy();
//		
//		a.sound();
//		d.bark();
//		d.sound();
//		p.weep();
//		p.sound();
//		p.bark();
//		
//	}
//}

////3. Hierarchical Inheritance
////Multiple subclasses inherit from the same superclass.
//
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//    void sound() {
//        System.out.println("Dog sound Dug Dug Dug");
//    }
//}
//
//class Cat extends Animal {
//    void meow() {
//        System.out.println("Cat meows");
//    }
//}
//class Inheritance{
//	public static void main(String[] args) {
//		Animal a = new Animal();
//		Dog d = new Dog();
//		Cat c = new Cat();
//		a.sound();
//		d.bark();
//		d.sound();
//		c.meow();
//		c.sound();
//	}
//}



