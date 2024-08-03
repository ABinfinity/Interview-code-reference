// This class implements two thread 
// at the same time with different operations to perform

class TwoThread{    
    public static void main(String[] args) {        
        Thread tEven = new Thread(() -> {
        for(int i=2;i<=50; i=i+2)
          System.out.println("Thread 1: " + i);
            
        } );
        
        Thread tOdd = new Thread(() -> {
        for(int i=1;i<=50; i=i+2)
          System.out.println("Thread 2: " + i);
            
        } );
        tEven.start();
        tOdd.start();
    }
}
