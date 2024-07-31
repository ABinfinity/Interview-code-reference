// Initialise a thread by entending the thread class and implementing Runnable interface.

import java.io.*; 
class ThreadClass extends Thread { 
	public void run() // No need to ovverride run.
	{ 
		System.out.print("Welcome to GeeksforGeeks."); 
	} 
	public static void main(String[] args) 
	{ 
		ThreadClass g = new ThreadClass(); // creating thread 
		g.start(); // starting thread 
	} 
}

// ==================================================================================
// ==================================================================================


class ThreadClass implements Runnable { 
    public static void main(String args[]) 
    { 
        // create an object of Runnable target 
        ThreadClass gfg = new ThreadClass(); 
  
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
