// Program to illustrate difference between
// equals and == operator

// Tldr equals() --> content comparison
// == --> reference comparison

public class StringEqualOperator {
  public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
 
        System.out.println(s1 == s2); // true because reference is same
        System.out.println(s1 == s3); // false because reference is not same
        System.out.println(s1.equals(s2)); // true because content is same
        System.out.println(s1.equals(s3)); // true because content is same
    
  }
}
