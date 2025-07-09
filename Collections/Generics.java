import java.util.*;
/**
 * 
<>Generics  in Java<>.

 * / It is a part of collection framework in Util package and introduced in Java 5. 
 * / Generics in Java are a language feature that allows you to write classes, interfaces, and methods that operate on typed parameters.
 * / This means you can create a single class or method that works with any data type, while providing type safety at compile time.
 * / Type Safety – Catch type errors at compile time.
 * / Code Reusability – Write a single method/class that works with different data types.
 * / Eliminates Type Casting – Avoid explicit casting when retrieving data from collections.
 * / Improves Code Readability and Maintainability
 
 */

/**
syntax:
class Box<T> { 				Here, T is a type parameter (can be any name like E, K, V, etc.).
    private T value;
									<> non parameterized and <Integer> Parameterized.
    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
*/

//__________________________________________________________________________________________________________________________________________________

/**
 * / Before <> the issue like Code Duplication and redundancy and need to check type inference.
 * / So Java Engineers decided to keep the DataTypes as a parameters same as how the data was giving as parameters values. 
Example:
	 * / 	int a = 10; same as <Integer>
	 * / int b = 20;

	 */

//public class Generics {
//    public static void main(String[] args){
//        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(1);
//        nums.add(2);
//
////        nums.add("Foo"); // ❌ Compile-time error: "Foo" is not an Integer
//
//        addElementsToNums(nums); // ✅ Allowed due to type erasure
//
//        for(int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i)); // 💥 May throw ClassCastException at runtime
//        }
//    }
//
//    private static void addElementsToNums(List l){
//        l.add(3);        // Okay
//        l.add("Foo");    // Compiles! No type check (raw List used)
//    }
//}

/**
 * / Key Concept – Type Erasure{BackWark compatibility  before java 5}
 * / Java removes all generic type information at compile-time, 
 * / replacing it with raw types to maintain backward compatibility with legacy (non-generic) code.
*/

//public class Collection {
//    public static void main(String[] args){
//        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(1);
//        nums.add(2);
//
//        addElementsToNums(nums); // Passing List<Integer> to raw List
//
//        for(int i : nums){
//            System.out.println(i); // 💥 May throw ClassCastException at runtime
//        }
//    }
//
//    private static void addElementsToNums(List l){
//        l.add(3);         // OK
//        l.add("Foo");     // No compile error due to raw List
//    }
//}

//________________________________________________________________________________________________________________________________________________________

/**
 * / Type Erasure Recap:
 * / Generics are erased at compile time, so:
 * / List<Integer> → List
 * / The JVM only sees a raw List at runtime, so it can't prevent adding a String to a List<Integer> in addElementsToNums().
*/

//public class Collection {
//    public static void main(String[] args){
//        Integer[] nums = new Integer[5];
//        nums[0] = 10;
//        nums[1] = 20;
//
////        nums[2] = "Foo"; // ❌ Compile-time error
//
//        addElementsToNums(nums);
//
//        for(int i : nums){
//            System.out.println(i);
//        }
//    }
//
//    private static void addElementsToNums(Object[] nums){
//        nums[2] = 30;        // ✅ OK
//        nums[3] = "Foo";     // ❌ Runtime error: ArrayStoreException
//    }
//}

/**
 * / Arrays in Java are covariant and type-safe at runtime, unlike generics which use type erasure and lose type info at runtime.
*/
//public class CovariantDemo {
//    public static void printNumbers(List<? extends Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> ints = List.of(1, 2, 3);
//        List<Double> doubles = List.of(1.1, 2.2);
//
//        printNumbers(ints);    // ✅ Integer is a subtype of Number
//        printNumbers(doubles); // ✅ Double is a subtype of Number
//    }
//}

//_____________________________________________________________________________________________________________________________________________

// WildCards in Java

/**
* /A wildcard in Java generics is represented by a question mark (?), 
* /and it is used to denote an unknown type. It allows methods, classes, 
* /or interfaces to operate on generic types without knowing their exact type.

//Types of Wildcards in Java:
 * 
//1) 	Unbounded Wildcard: <?>
//	Means: “Any type”
//	Used when the code doesn't depend on the type parameter.
//Example:
//	void printBottle(Bottle<?> b) { ... }

//2)	Upper Bounded Wildcard: <? extends Type>
//	Means: “Type or any subclass of Type”
//	Used when you only need to read from a generic object.
//Example:
//	Bottle<? extends OralMedicine>

//3)	Lower Bounded Wildcard: <? super Type>
//	Means: “Type or any superclass of Type”
//	Used when you want to write into a generic object

 */

//Example:
//	Bottle<? super Tablet>

//IS / A Behavior like creating objects with base to sub class. 

//Base class
//class OralMedicine {}

//Subclasses
//class Capsule extends OralMedicine {}
//class Tablet extends OralMedicine {}
//
////Generic Bottle class
//class Bottle<T> {
// private T item;
//
// public Bottle() {}
//
// public Bottle(T item) {
//     this.item = item;
// }
//
// public void setItem(T item) {
//     this.item = item;
// }
//
// public T getItem() {
//     return this.item;
// }
//}
//


////Main class with wildcard usage

//class OralMedicine {}
//class Capsule extends OralMedicine {}
//class Tablet extends OralMedicine {}
//class Injection {}
//
//class Bottle<T> {
//    private T item;
//
//    public Bottle() {}
//
//    public Bottle(T item) {
//        this.item = item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return this.item;
//    }
//}
//
//public class Collection {
//    public static void main(String[] args) {
//        OralMedicine omed1 = new Tablet();
//        OralMedicine omed2 = new Capsule();
//        // Error: Injection is not a subclass of OralMedicine
//        // OralMedicine omed3 = new Injection();
//
//        Bottle<?> tabletBottle = new Bottle<Tablet>(new Tablet());
//        Bottle<?> capsuleBottle = new Bottle<Capsule>(new Capsule());
//        Bottle<?> injectionBottle = new Bottle<Injection>(new Injection());
//
//        logBottleInfo(new Bottle<Tablet>(new Tablet()));
//        logBottleInfo(new Bottle<Capsule>(new Capsule()));
//        logBottleInfo(new Bottle<Injection>(new Injection()));
//    }
//
//    private static void logBottleInfo(Bottle<?> bottle) {
//        System.out.println("logBottleInfo: " + bottle.getItem().getClass().getName());
//    }
//}

//UpperBound is WildCard -> Extends

//class OralMedicine {}
//class Capsule extends OralMedicine {}
//class Tablet extends OralMedicine {}
//class Injection {}
//
//class Bottle<T> {
//    private T item;
//
//    public Bottle() {}
//
//    public Bottle(T item) {
//        this.item = item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return this.item;
//    }
//}
//
//public class Collection {
//    public static void main(String[] args) {
////        OralMedicine omed1 = new Tablet();
////        OralMedicine omed2 = new Capsule();
//        // Error: Injection is not a subclass of OralMedicine
//        // OralMedicine omed3 = new Injection();
//
//        Bottle<? extends OralMedicine> tabletBottle = new Bottle<Tablet>(new Tablet());
//        Bottle<? extends OralMedicine> capsuleBottle = new Bottle<Capsule>(new Capsule());
////        Bottle<? extends OralMedicine> injectionBottle = new Bottle<Injection>(new Injection()); complie error
//
//        logBottleInfo(new Bottle<Tablet>(new Tablet()));
//        logBottleInfo(new Bottle<Capsule>(new Capsule()));
////        logBottleInfo(new Bottle<Injection>(new Injection())); //Compile error
//    }															 //UpperBound is called as to check the any sub class/extends the main class
//
//    private static void logBottleInfo(Bottle<? extends OralMedicine> bottle) {		   //Here we setting bound to check the any sub class limit.  
//        System.out.println("logBottleInfo: " + bottle.getItem().getClass().getName());
//    }
//}

////Lower Bound in WildCards -> super()

//class HumanMedicine{};
//class OralMedicine extends HumanMedicine{}
//class Capsule extends OralMedicine {}
//class Tablet extends OralMedicine {}
//class Injection {}
//
//class Bottle<T> {
//    private T item;
//
//    public Bottle() {}
//
//    public Bottle(T item) {
//        this.item = item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return this.item;
//    }
//}
//
//public class Collection {
//    public static void main(String[] args) {
////        OralMedicine omed1 = new Tablet();
////        OralMedicine omed2 = new Capsule();
//    	
//        // Error: Injection is not a subclass of OralMedicine
////         OralMedicine omed3 = new Injection();
//
//    	Bottle<? super OralMedicine> tabletBottle = new Bottle<OralMedicine>(new Tablet());
//        Bottle<? super OralMedicine> capsuleBottle = new Bottle<OralMedicine>(new Capsule());
//        
////       Bottle<? extends OralMedicine> injectionBottle = new Bottle<Injection>(new Injection()); //complie error
//
//        logBottleInfo(new Bottle<OralMedicine>(new Tablet()));
//        logBottleInfo(new Bottle<HumanMedicine>(new Capsule()));
//        
////        logBottleInfo(new Bottle<Injection>(new Injection())); //Compile error
//        //LowerBound refer to super class with extended by sub main class.
//        LogAnyBottle(new Bottle<Injection>(new Injection())); //BY this way we can print specialized class with not in bound/limitof super/base class'
//    }
//
//    private static void logBottleInfo(Bottle<? super OralMedicine> bottle) {		   //Here we setting bound to check the any sub class limit.  
//        System.out.println("logBottleInfo: " + bottle.getItem().getClass().getName()); //Checking with super() key.
//    }
//
//    private static void LogAnyBottle(Bottle<?> bottle) {
//        System.out.println("logAnyBottle: " + bottle.getItem().getClass().getName());
//    }
//}

//static in WildCards

//class OralMedicine {}
//class Capsule extends OralMedicine {}
//class Tablet extends OralMedicine {}
//class Injection {}
//
//class Bottle<T> {
//    private T item;
//
//    public Bottle() {}
//
//    public Bottle(T item) {
//        this.item = item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return this.item;
//    }
//
//    public static <T> String doSomething(T item) {
//        return item.toString();
//    }
//}
//
//public class Collection {
//    public static void main(String[] args) {
//        String returnVal = Bottle.doSomething(new Tablet());
//        System.out.println(returnVal);
//
//        returnVal = Bottle.doSomething(new Injection());
//        System.out.println(returnVal);
//    }
//}
//

//class OralMedicine {
//    @Override
//    public String toString() {
//        return "OralMedicine";
//    }
//}
//
//class Capsule extends OralMedicine {
//    @Override
//    public String toString() {
//        return "Capsule";
//    }
//}
//
//class Tablet extends OralMedicine {
//    @Override
//    public String toString() {
//        return "Tablet";
//    }
//}
//
//class Injection {
//    @Override
//    public String toString() {
//        return "Injection";
//    }
//}
//
//class Bottle<T> {
//    private T item;
//
//    public Bottle() {}
//
//    public Bottle(T item) {
//        this.item = item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return this.item;
//    }
//
//    public static <T> String doSomething(T item) {
//        return item.toString();
//    }
//}
//
//public class Collection {
//    public static void main(String[] args) {
//        String returnVal = Bottle.doSomething(new Tablet());
//        System.out.println(returnVal);  // Output: Tablet
//
//        returnVal = Bottle.doSomething(new Injection());
//        System.out.println(returnVal);  // Output: Injection
//    }
//}
//
