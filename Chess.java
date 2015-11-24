
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
        //display();
        resetPieces();
        display();
    }
    
    
    public void reset()
    {
        // lines 
        int i = 8; 
        while(i>=1)
        {
            List <String> squares = new ArrayList<String>();
            // rows
            for(char letter : letters ){
                squares.add(letter + Integer.toString(i));    
            }
            i--;
            int j=1; 
            for(String square : squares){
                //if the line is even
                if (i%2 == 0)
                    board.put(square, (j%2 == 0) ? '☐' : '☒');
                  else 
                    board.put(square, (j%2 == 0) ? '☒' : '☐');
                
                        
                j++;
            }
        }
    }
    
    public void resetPieces()
    {
        move("", "a8",'r');
        move("", "b8",'n');
        move("", "c8",'b');
        move("", "d8",'q');
        move("", "e8",'k');
        move("", "f8",'b');
        move("", "g8",'n');
        move("", "h8",'r');
        
        move("", "a7",'p');
        move("", "b7",'p');
        move("", "c7",'p');
        move("", "d7",'p');
        move("", "e7",'p');
        move("", "f7",'p');
        move("", "g7",'p');
        move("", "h7",'p');
        
        move("", "a1",'r');
        move("", "b1",'n');
        move("", "c1",'b');
        move("", "d1",'q');
        move("", "e1",'k');
        move("", "f1",'b');
        move("", "g1",'n');
        move("", "h1",'r');
        
        move("", "a2",'p');
        move("", "b2",'p');
        move("", "c2",'p');
        move("", "d2",'p');
        move("", "e2",'p');
        move("", "f2",'p');
        move("", "g2",'p');
        move("", "h2",'p');
    }
    
    public void checkMove(){}
    
    public void move(String fromSquare, String toSquare, Character piece)
    {
        if (fromSquare != "")
            board.put(fromSquare,'☐');
        board.put(toSquare,piece);
    }
    
    public void display()
    {   
        StringBuilder display = new StringBuilder();
        
        for(int i=8; i>=1; i--){
            display.append(Integer.toString(i)+" ");
            for(char letter : letters){
                String index = Character.toString(letter) + Integer.toString(i);
                display.append(board.get(index) + " ");
            }
            display.append("\n");
        }
        
        // System.out.println(board);
        
        display.append("  ");
        
        for(char letter : letters)
            display.append(letter+" ");
        
        System.out.println(display.toString());
    }
    
    public void update(){}
    
    
}