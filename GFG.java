package day6;

public class GFG {

	public static void main(String[] args) {
		 // creating two threads 
        TheadNaming t1 = new TheadNaming(); 
        TheadNaming t2 = new TheadNaming(); 
          
        // getting the above created threads names. 
        System.out.println("Thread 1: " + t1.getName()); 
        System.out.println("Thread 2: " + t2.getName()); 
          
        t1.start(); 
        t2.start(); 
          
        // Now changing the name of threads. 
        t1.setName("hcl"); 
        t2.setName("hcl tech"); 
          
        // again getting the new names  
        // of the threads. 
        System.out.println("Thread names after changing the "+  
        "thread names"); 
        System.out.println("New Thread 1 name:  " + t1.getName()); 
        System.out.println("New Thread 2 name: " + t2.getName()); 
          
    } 

	}


