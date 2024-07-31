// Program to illustrate
// Custom exception class in java
public class CustomException extends Exception {
    public CustomException(){
        super();
    }
    
    public CustomException(String message){
        super(message);
    }
    
    public static void giveException(Integer number) throws CustomException{
        if(number < 0)
            throw new CustomException("Number cannot be negative.");
        else
            System.out.println("Number is: " + number);
    }
   
    public static void main(String[] args) {
        try{
            giveException(-4);
        }catch(Exception e){
             System.out.println(e);
        }
      
       
    }
}
