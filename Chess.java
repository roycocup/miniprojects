
import java.util.*;

class Chess{
    
    public static void main(String[] args)
    {
        Chess chess = new Chess();    
    }
    
    Map<String,Character> board = new HashMap<String, Character>(); 
    List<String> moves = new ArrayList<String>();
    Character[] letters = {'a','b','c','d','e','f','g','h'};
    String move;
    
    public Chess()
    {
        reset();
        display();
        // resetPieces();
    }
    
    
    public void reset()
    {
        int i = 8; 
        while(i>=1)
        {
            List <String> squares = new ArrayList<String>();
            
            for(char letter : letters ){
                squares.add(letter + Integer.toString(i));    
            }
            i--;
            for(String square : squares)
                board.put(square, '\0');
        }
    }
    
    public void resetPieces()
    {
        move("", "8a",'r');
        move("", "8b",'n');
        move("", "8c",'b');
        move("", "8d",'q');
        move("", "8e",'k');
        move("", "8f",'b');
        move("", "8g",'n');
        move("", "8h",'r');
        System.out.println(board);
    }
    
    public void checkMove(){}
    
    public void move(String fromSquare, String toSquare, Character piece)
    {
        if (fromSquare != "")
            board.put(fromSquare,'\0');
        board.put(toSquare,piece);
    }
    
    public void display()
    {
        for(int i=8; i>=1; i--){
            for(char letter : letters){
                // System.out.print(letter + Integer.toString(i));   
            }
        }
        System.out.print(board);
    }
    
    public void update(){}
    
    
}