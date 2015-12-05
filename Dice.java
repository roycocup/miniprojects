import java.util.*;

class Dice {
    
    public static void main(String[] args){
        long startTime = System.nanoTime();
        int[] frequency = new int[6];
        Random r = new Random();
        long tries = 60000000;
        
        for (int i = 0; i <= tries ; i++)
            ++frequency[r.nextInt(6)];
        
        for(int i = 0;  i < frequency.length; i++){
            double percent = (float) (frequency[i]*100)/tries;
            System.out.println("Side:" + (i+1) + " Freq:" + frequency[i] + "("+percent+"%)");
        }
        long endTime = System.nanoTime();
        System.out.println("Done in "+ (endTime - startTime)/1000000 + " miliseconds" );
        
    }
}
