import java.util.*;
import java.time.Duration; 

class Timer{
    
    private int seconds = 5;
    
    public Timer(){
        runTimer().start();
    }
    
    private Thread runTimer(){
        Thread t1 = new Thread(
            new Runnable() {
                public void run()
                {
                    for(int i = seconds; i > 0; i--){
                        try{
                            Thread.sleep(1000);
                            System.out.println(i);
                        }catch(InterruptedException e){}
                    }
                    
                }
            }
        );
        return t1;
    }
    
    
    public static void main(String[] args){
        Timer timer = new Timer();       
    }
    
}