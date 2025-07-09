import java.util.*;

/**
* /Lamda Expressions in Java
* /✅ What is a Lambda Expression?
* /Introduced in Java 8
* /A shortcut to implement functional interfaces
* /Helps write clean, concise, and readable 
 * */

/**
						✅ Syntax:
				(parameter) -> { body }
 * */


//@FunctionalInterface
//interface MyUtilInterface {
//    boolean isEven(int a);
//}
//
//public class Collection {
//    public static void main(String[] args) {
//        MyUtilInterface m = (a) -> a % 2 == 0;
//        System.out.println(m.isEven(10)); // true
//    }
//}

//--------------------------------------------------------------

//Build in Functions in Interface

//✅ 1. Predicate<T>
//
//@FunctionalInterface
//public interface Predicate<T> {
//    boolean test(T t);
//}
//
//Predicate<Integer> isEven = n -> n % 2 == 0;
//System.out.println(isEven.test(4)); // true
//
//1) Input: Any type (T)
//
//2) Output: boolean
//
//3) Used to check conditions

//---------------------------------------------------------------------------

//✅ 2. Consumer<T>
//
//@FunctionalInterface
//public interface Consumer<T> {
//    void accept(T t);
//}
//Example:
//Consumer<String> printer = s -> System.out.println("Hello " + s);
//printer.accept("Lohit"); // Hello Lohit
//1) Input: Any type (T)
//
//2) Output: void (nothing)
//
//3) Used to perform an action, like printing or saving

//-----------------------------------------------------------------------------

//✅ 3. Supplier<T>
//
//@FunctionalInterface
//public interface Supplier<T> {
//    T get();
//}
//Example:
//Supplier<String> greet = () -> "Good morning!";
//System.out.println(greet.get()); // Good morning!
//
//1) Input: None
//
//2) Output: Any type (T)
//
//3) Used to supply values, like random numbers

//-----------------------------------------------------------------------------

//✅ 4. Function<T, R>
//@FunctionalInterface
//public interface Function<T, R> {
//    R apply(T t);
//}
//Example:
//Function<String, Integer> length = str -> str.length();
//System.out.println(length.apply("Lohit")); // 5
//1) Input: Type T
//
//2) Output: Type R
//
//3) Used to convert or process data

//-------------------------------------------------------------------------------------------

//| Interface | Input  | Output     | Use for...                 |
//| --------- | -----  | ---------  | -------------------------- |
//| Predicate | ✅ Yes | ✅ Boolean | Check conditions           |
//| Consumer  | ✅ Yes | ❌ Void    | Do something with input    |
//| Supplier  | ❌ No  | ✅ Yes     | Supply/generate a value    |
//| Function  | ✅ Yes | ✅ Yes     | Transform or return result |
//
//

//----------------------------------------------------------------------------------------------------------

//Difference between Lamda and Anonymous Inner Class Example

//1) Lamda :
//	
//	public void methodA() {
//    methodB(a -> a % 2 == 0);  // Lambda expression
//}
//
//public void methodB(Predicate<Integer> m) {
//    boolean result = m.test(5);
//}
		
//			1) ``Lambda = short-cut way to implement functional interface
//			2) ``Less code, more readable.
// 			3) Even if mutiple lamda expressions written it only stprd in the single Lamda Class only(Lamda.Example.class).

//----------------------------------------------------------------------------------------------------------------------------------

//Anonymous Inner Class Example

//methodB(new Predicate<Integer>() {
//    @Override
//    public boolean test(Integer integer) {
//        return integer % 2 == 0;
//    }
//});

//			``1) This is older style — we manually implement the test() method using an anonymous class.
//
//			  2) Does the same check: is the number even?
//
//			  3) More code, but does the same thing.

//            4) In Anonymous Inner Class by the creating of each class it store in the each seperate class file with will load burden for JVM. 

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//✅ Lexical Scope in Java
//"Lexical scope means the scope of variables is determined by the code's layout, not by how or when it runs. "
//"Lambdas in Java follow lexical scoping."

//process of it ;/

//Lamda same reference will present wich point the main class like class demo{ lamda1 , lamda2, lamda3 it will point only one main class. with same reference
//Anonymus will be diffrent reference will present which point the inner class of each sub class. class demo{ class demo1{ class demo 2 each class has diffrent refrence. 

//-----------------------------------------------------------------------------------------------------------------------------------------------------------


//Lamda expression with Zero parameter
//class Collection{
//	@FunctionalInterface
//	public interface myPrinter{
//		void print();
//	}
//	public static void main(String[] args) {
//		myPrinter printer = ()-> System.out.println("Heloo world");
//		printer.print();
//	}
//}

//Lamda expression with one parameter
//class Collection{
//	@FunctionalInterface
//	public interface bottle{
//		void oil(String brand);
//	}
//	public static void main(String[] args) {
//		bottle b = (brand) -> System.out.println("Oil brnad is :" + brand);
//		b.oil(" Parashut");
//	}
//}

////Lamda expression with Multiple parameter
//class Collection{
//	@FunctionalInterface
//	public interface calculator<T>{
//		public T opeartions(int a, int b);
//	}
//	public static void main(String[] args) {
//		calculator add = (a, b) -> a + b;
//		calculator sub = (a, b) -> a - b;
//		calculator multi = (a, b) -> a*b;
//		
//		System.out.println(add.opeartions(5, 5));
//		System.out.println(sub.opeartions(5, 5));
//		System.out.println(multi.opeartions(5, 5));
//		
//	}
//}

//Lambda with Block Body (multiple statements)
//class Collection{
//	interface Calculator<T>{
//		public T operation(int a, int b);
//	}
//	public static void main(String[] args) {
//		Calculator check = (a, b) -> { System.out.print("The operation value is : ");
//		return a-b;
//		};
//		System.out.println(check.operation(10, 25));
//	}
//}

//Return a Map<String, Integer> from a Lambda

//class Collection{
//	@FunctionalInterface
//	public interface Calculator<T>{
//		public T operation(int a, int b);
//	}
//	public static void main(String[] args) {
//		Calculator<Map<String, Integer>> operations = (a, b) -> {Map<String, Integer> result = new HashMap<>();
//				result.put("Addtion", a+b);
//				result.put("Subtraction", a-b);
//				result.put("Multiplication", a*b);
//				result.put("Division", a/b);
//				return result;
//				};
//				
//				Map<String, Integer> outPut = operations.operation(6, 10);
//				outPut.forEach((operation, value) -> System.out.println(operation + ": " + value));
//	}
//}


//class Collection {
//    @FunctionalInterface
//    interface FrequencyCounter {
//        Map<Character, Integer> count(String input);
//    }
//
//    public static void main(String[] args) {
//        FrequencyCounter counter = (input) -> {
//            Map<Character, Integer> freqMap = new HashMap<>();
//            for (char ch : input.toCharArray()) {
//                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//            }
//            return freqMap;
//        };
//
//        String str = "programming";
//        Map<Character, Integer> frequency = counter.count(str);
//
//        frequency.forEach((ch, count) -> System.out.println(ch + ": " + count));
//    }
//}

//@FunctionalInterface
//interface StringOperation {
//    String operate(String s);
//}
//public class Collection {
//    public static void main(String[] args) {
//        StringOperation reverse = (s) -> new StringBuilder(s).reverse().toString();
//        System.out.println(reverse.operate("Lohit")); // Output: tihoL
//    }
//}

@FunctionalInterface
	interface sumOfArray{
		int operation(int[] nums);
}
	class Collection{
		public static void main(String[] args) {
			sumOfArray sum = (nums) -> {
				int total =0;
				for(int num : nums) total += num;
				return total;
			};
			int nums[] = {1,2,3,4,5};
			System.out.println("Sum : " + sum.operation(nums));
		}
	}