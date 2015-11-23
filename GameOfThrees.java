


class GameOfThrees{
    
    int n = 31337357;
    int rec_count = 0; 
    
    public static void main(String[] args){
        GameOfThrees G = new GameOfThrees();
    }
    
    
    public GameOfThrees(){
        System.out.println(n);
        divideIt(n, '+');
    }
    
    
    private int divideIt(int n, char symbol){
        rec_count++; 
        
        if (rec_count >= 150){
            System.out.println("Too many recursions.");
            return 0;
        }
            
        // if its one, stop
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        
        if (isDivisible(n)){
            n = n/3;
            System.out.println(n);
            return divideIt(n, '+'); 
        }else if (!isDivisible(n) && symbol == '-'){
            System.out.print(n+2); System.out.println(" (+1)");
            return divideIt(n+2, '+');
        }else {
            System.out.print(n-1); System.out.println(" (-1)");
            return divideIt(n-1, '-');
        }
    }
    
    
    private Boolean isDivisible(int n)
    {
        if (n%3 == 0)
            return true; 
        return false;
    }
    
    
}