import java.util.*;
import java.time.Duration; 

class Timer{
    
    private int seconds = 5;
    
    public Timer(int seconds){
        this.seconds = seconds;
        runTimer().start();
    }
    
    private Thread runTimer(){
        Thread t1 = new Thread(
            new Runnable() {
                public void run()
                {
                    for(int i = this.seconds; i > 0; i--){
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
        if (args.length() > 0)
            new Timer(Integer.toInteger(args[0]));       
        else
            new Timer(Integer.toInteger(0));       
    }   
    
}