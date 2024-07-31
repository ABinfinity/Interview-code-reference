// Initialise a thread by entending the thread class and implementing Runnable interface.

import java.io.*; 
class InitiateThread extends Thread { 
	public void run() // No need to ovverride run.
	{ 
		System.out.print("Welcome to GeeksforGeeks."); 
	} 
	public static void main(String[] args) 
	{ 
		InitiateThread g = new InitiateThread(); // creating thread 
		g.start(); // starting thread 
	} 
}

// ==================================================================================
// ==================================================================================


class InitiateThread implements Runnable { 
    public static void main(String args[]) 
    { 
        // create an object of Runnable target 
        InitiateThread gfg = new InitiateThread(); 
  
        // pass the runnable reference to Thread 
        Thread t = new Thread(gfg, "gfg"); 
  
        // start the thread 
        t.start(); 
  
        // get the name of the thread 
        System.out.println(t.getName()); 
    } 
    @Override public void run() 
    { 
        System.out.println("Inside run method"); 
    } 
}
