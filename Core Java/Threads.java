package coreJava;

import java.util.Scanner;

//public class Threads {
//	public static void main(String[] args) throws Exception {
//		System.out.println("Addtion task started ");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the first number : ");
//		int a = scan.nextInt();
//		System.out.println("Enter a second number");
//		int b = scan.nextInt();
//		int c= a+b;
//		System.out.println("The value of c is :" + c);
//		System.out.println("Addtion task is completed");
//		
//		System.out.println("Character Printing task started");
//		for(int i=65; i<=75; i++) {
//			System.out.println((char)i);
//			Thread.sleep(1000);
//		}
//		System.out.println("Character Printing task completed");
//		
//		System.out.println("Number priniting task started");
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		System.out.println("Number printing task completed");		
//	}
//}

//class Demo1 extends Thread{
//	public void run() {
//		System.out.println("Addition acitivity started");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number : ");
//		int a = scan.nextInt();
//		System.out.println("Enter second number : ");
//		int b = scan.nextInt();
//		
//		int c = a+b;
//		System.out.println("The addition value of c is : " + c);
//		
//		System.out.println("Addition acitivity ended");
//	}
//}
//
//class Demo2 extends Thread{
//	public void run() {
//		System.out.println("Character Printing task started");
//		for(int i=65; i<=75; i++) {
//			System.out.println((char)i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Character Printing acitivity ended");
//	}
//}
//
//class Demo3 extends Thread{
//	public void run() {
//		System.out.println("Number Printing task started");
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Number Printing acitivity ended");
//	}
//}
//
//class Threads{
//	public static void main(String[] args) {
//		Demo1 d1 = new Demo1();
//		Demo2 d2 = new Demo2();
//		Demo3 d3 = new Demo3();
//		
//		d1.run();
//		d2.run();
//		d3.run();
//	}
//}

//______________________________________________________________________________

//RUNNABLE INTERFACE
//class Demo1 implements Runnable{
//	public void run() {
//		System.out.println("Addition acitivity started");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number : ");
//		int a = scan.nextInt();
//		System.out.println("Enter second number : ");
//		int b = scan.nextInt();
//		
//		int c = a+b;
//		System.out.println("The addition value of c is : " + c);
//		
//		System.out.println("Addition acitivity ended");
//	}
//}
//
//class Demo2 implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("Character Printing task started");
//		for(int i=65; i<=75; i++) {
//			System.out.println((char)i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Character Printing acitivity ended");
//	}
//}
//
//class Demo3 implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("Number Printing task started");
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Number Printing acitivity ended");
//	}
//}
//
//class Threads{
//	public static void main(String[] args) {
//		Demo1 d1 = new Demo1();
//		Demo2 d2 = new Demo2();
//		Demo3 d3 = new Demo3();
//										//in the run() created then start() should yse for to run code to achieve desire output.
//										//if call the run() directly then only same output print as above code
//		Thread t1 = new Thread(d1);
//		Thread t2 = new Thread(d2);
//		Thread t3 = new Thread(d3);
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}


//______________________________________________________________________________

//Multi Threading using single run() method

//class SingleRun implements Runnable{
//	@Override
//	public void run() {
//		Thread t = Thread.currentThread();
//		String name = t.getName();
//		
//		if(name.equals("ADD") == true) {
//			add();
//		}
//		else if(name.equals("charPrint") == true) {
//			charPrint();
//		}
//		else {
//			numPrint();
//		}
//	}
//	public void add() {
//		System.out.println("Addition acitivity started");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number : ");
//		int a = scan.nextInt();
//		System.out.println("Enter second number : ");
//		int b = scan.nextInt();
//		
//		int c = a+b;
//		System.out.println("The addition value of c is : " + c);
//		
//		System.out.println("Addition acitivity ended");
//	}
//	public void charPrint() {
//		System.out.println("Character Printing task started");
//		for(int i=65; i<=75; i++) {
//			System.out.println((char)i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Character Printing acitivity ended");
//	}
//	
//	public void numPrint() {
//		System.out.println("Number Printing task started");
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Number Printing acitivity ended");
//	}
//}
//
//class Threads{
//	public static void main(String[] args) {
//		SingleRun sr = new SingleRun();
//		
//		Thread t1 = new Thread(sr);
//		Thread t2 = new Thread(sr);
//		Thread t3 = new Thread(sr);
//		
//		t1.setName("ADD");
//		t2.setName("CHAR");
//		t3.setName("NUM");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}

//______________________________________________________________________________

//Demon Thread

//➤ It is a low-priority thread that runs in the background to perform specific tasks such as garbage collection, finalization, etc.
//
//➤ The JVM automatically terminates a daemon thread if all the user threads are completed.
//
//➤ To create a daemon thread in Java, you simply need to call the setDaemon(true) method on a Thread object before starting the thread.

//class Demo1 extends Thread{
//	public void run() {
//		for(int i=0; i<=5; i++) {
//			System.out.println("User Thread Executing " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				System.out.println("Some problem, occurred");
//			}
//		}
//		System.out.println("User thread completed");
//	}
//}
//
//class Demo2 extends Thread{
//	public void run() {
//		   for( ; ; ) {
//			   System.out.println("Demon thread is executing");
//			   try {
//				   		 Thread.sleep(1000);
//			} catch (Exception e) {
//				System.out.println("Some peoblem occured");
//			}
//		   }
//	}
//}
//
//class Threads{
//	public static void main(String[] args) {
//		Demo1 d1 = new Demo1();
//		Demo2 d2 = new Demo2();
//		
//		d2.setDaemon(true);
//		
//		d1.start();
//		d2.start();
//		System.out.println("Main() execution is completed");
//	}
//}

//________________________________________________________________________________________

//Lock and Unlock
//ABOVE CODE:  This program demonstrates multi-threading in Java using the Runnable interface, 
//where multiple threads share the same task (Printer) but work independently, identified by their thread names.

//class Printer implements Runnable{
//	public void run() {
//		String name = Thread.currentThread().getName();
//		
//		System.out.println(name + " is printing");
//		for(int i=0; i<=3; i++) {
//			System.out.println(name + " is printing");
//			try {
//				Thread.sleep(4000);
//			}catch(Exception e) {
//				System.out.println("Some problem occured");
//			}
//		}
//		System.out.println(name + "Completed printing");
//	}
//}
//
//class Threads{
//	public static void main(String[] args) throws Exception {
//			Printer p = new Printer();
//			
//			Thread t1 = new Thread(p);
//			Thread t2 = new Thread(p);
//			Thread t3 = new Thread(p);
//			
//			t1.setName("ROHIT");
//			t2.setName("ALLU");
//			t3.setName("PAWAN");
//			
//			t1.start();
//			t2.start();
//			t3.start();
//	}
//}

//________________________________________________________________________

//  Multithreading with Synchronization
//
//➤ To prevent unexpected output in a multi-threaded Java program where multiple threads access a common resource simultaneously, 
//   locks can be used to ensure that only one thread has access to the resource at any given time. 
//   
//➤ This is achieved by synchronizing access to the resource using the synchronized keyword.
//
//➤ The thread scheduler ensures that only one thread has access to the locked resource at any given time. 
//
//➤ other threads must wait until the lock is released by the executing thread.

//class Printer implements Runnable{
//synchronized public void run() { 	//now by appplying lock to run(), no other threads will be able to access it.
//	String name = Thread.currentThread().getName();
//	
//	System.out.println(name + " Started printing");
//	for(int i=0; i<=3; i++) {
//		System.out.println(name + " is printing");
//		try {
//			Thread.sleep(4000);
//		}catch(Exception e) {
//			System.out.println("Some problem occured");
//		}
//	}
//	System.out.println(name + "Completed printing");
//}
//}
//
//class Threads{
//public static void main(String[] args) throws Exception {
//		Printer p = new Printer();
//		
//		Thread t1 = new Thread(p);
//		Thread t2 = new Thread(p);
//		Thread t3 = new Thread(p);
//		
//		t1.setName("ROHIT");
//		t2.setName("ALLU");
//		t3.setName("PAWAN");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//}
//}

//__________________________________________________________________

//Case 2:

//➤ If you aim to lock an entire method, incorporate the synchronized keyword into the method's signature.
//
//➤ If the need is to lock only specific lines within a method, utilize a synchronized block
//
//➤ In the provided code, we've implemented a lock using the synchronized keyword for lines 5, 6, and 7.
//
//➤ When observing the output, it becomes evident that these lines are executed b only one thread at any given time.
//
//Syntax:
//
//synchronized (Object ref)
//
//{
//
//// block of code.
//
//}

//class Demo implements Runnable{
//	public void run() {
//		String name = Thread.currentThread().getName();
//		try {
//			System.out.println(name + " is executing first line");
//			Thread.sleep(3000);
//			System.out.println(name + " is executing second line");
//			Thread.sleep(3000);
//			System.out.println(name + " is executing third line");
//			Thread.sleep(3000);
//			
//			synchronized (this) {  //in simple term, the line print of 4 and 5 will each one seperate.
//				System.out.println(name + " is executing fourth line");
//				Thread.sleep(3000);
//				System.out.println(name + " is executing fifth line");
//				Thread.sleep(3000);
//			}
//			System.out.println(name + " is executing sixth line");
//			Thread.sleep(3000);
//			System.out.println(name + " is executing seventh line");
//			Thread.sleep(3000);
//			System.out.println(name + " is executing eighth line");
//			Thread.sleep(3000);
//		}
//		catch(Exception e) {
//			System.out.println("Some problem occured");
//		}
//	}
//}
//
//class Threads{
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		Thread t1 = new Thread(d);
//		Thread t2 = new Thread(d);
//		
//		t1.setName("One");
//		t2.setName("Two");
//		
//		t1.start();
//		t2.start();
//	}
//}

//--------------------------------------------------------------------------------

//Runnable interface
//Define a task using Runnable interface
//class MyRunnable implements Runnable {
// public void run() {
//     System.out.println("Runnable thread is running...");
// }
//}
//
//public class Threads {
// public static void main(String[] args) {
//     // Step 1: Create object of Runnable implementation
//     MyRunnable task = new MyRunnable();
//
//     // Step 2: Pass it to Thread class
//     Thread thread = new Thread(task);
//
//     // Step 3: Start the thread
//     thread.start();
// }
//}

//	// Real Time exple
//	// Task: Simulate downloading a file
//	class FileDownloader implements Runnable {
//	    public void run() {
//	        System.out.println("Download started...");
//
//	        // Simulate time taken to download
//	        try {
//	            for (int i = 1; i <= 5; i++) {
//	                System.out.println("Downloading... " + (i * 20) + "%");
//	                Thread.sleep(1000); // wait for 1 second
//	            }
//	        } catch (InterruptedException e) {
//	            System.out.println("Download interrupted.");
//	        }
//
//	        System.out.println("Download complete!");
//	    }
//	}
//
//	public class Threads{
//	    public static void main(String[] args) {
//	        // Creating the download task
//	        FileDownloader downloader = new FileDownloader();
//
//	        // Running it in a separate thread
//	        Thread downloadThread = new Thread(downloader);
//
//	        System.out.println("User clicks 'Download' button");
//
//	        downloadThread.start(); // start downloading in background
//
//	        System.out.println("User continues browsing...");
//	    
//	}
//}

//----------------------------------------------------------------------------------------

//Using Thread Class (Extending Thread)

////Define a task by extending the Thread class
//class MyThread extends Thread {
// public void run() {
//     System.out.println("Thread class is running...");
// }
//}
//
//public class Threads {
// public static void main(String[] args) {
//     // Step 1: Create object of Thread subclass
//     MyThread thread = new MyThread();
//
//     // Step 2: Start the thread
//     thread.start();
// }
//}

////RealTime Example
////Task: Check for updates by extending Thread class

//class UpdateChecker extends Thread {
// public void run() {
//     System.out.println("Update check started...");
//
//     try {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println("Checking update step " + i + "...");
//             Thread.sleep(1000); // simulating work
//         }
//     } catch (InterruptedException e) {
//         System.out.println("Update check interrupted.");
//     }
//
//     System.out.println("Update check complete!");
// }
//}
//
//public class Threads {
// public static void main(String[] args) {
//     // Create thread object
//     UpdateChecker updater = new UpdateChecker();
//
//     System.out.println("User opens settings app");
//
//     // Start the update checker in background
//     updater.start();
//
//     System.out.println("User continues using the app...");
// }
//}
//--------------------------------------------------------------------------------------------------------
//| Feature                 | Runnable                     | Thread              |
//| ----------------------- | ---------------------------- | ------------------- |
//| Inherits                | No (implements interface)    | Yes (extends class) |
//| Can extend other class? | ✅ Yes                        | ❌ No                |
//| Reusability             | ✅ Better                     | 👎 Less             |
//| Method to override      | `run()`                      | `run()`             |
//| Object creation         | `new Thread(runnableObject)` | `new MyThread()`    |
