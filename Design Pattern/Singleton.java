// Below is the implementaion of Singleton Design Pattern in Java
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Singleton {
  private static Singleton instance;
  private Singleton(){
      System.out.println("Constructor was called.");
  }
  
  public static synchronized Singleton getInstance(){
      if(instance == null){
          instance = new Singleton();
      }
      return instance;
  }

  // Below is the implementation of double checking
  // public static Singleton getInstance()
  //   {
  //       if (obj == null) {
  //           // To make thread safe
  //           synchronized (Singleton.class)
  //           {
  //               // check again as multiple threads
  //               // can reach above step
  //               if (obj == null)
  //                   obj = new Singleton();
  //           }
  //       }
  //       return obj;
  //   }

  
  public void doSomething(){
       System.out.println("Sample was called.");
  }
    
 public static void main(String[] args) {
     
    Singleton.getInstance().doSomething();
    Singleton.getInstance().doSomething();
    
  }
}
