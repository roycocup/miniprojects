
import java.util.*;

class Typoglycemia 
{
    List<String> finalString = new ArrayList<String>(); 
 
    public static void main(String [] args)
    {
        Typoglycemia T = new Typoglycemia(args[0]);
    }
    
    public Typoglycemia(String iStr)
    {
        String[] words = iStr.split(" ");
        List<Character> tempList = new ArrayList<Character>();
        
        //interate every word
        for (int i=0; i<=words.length-1; i++){
            String word = words[i];
            int wrd_len = word.length();
            Map<Integer, Character> m = new HashMap<Integer, Character>();
            List<Integer> used = new ArrayList<Integer>();
            
            
            // Iterate every letter
            for (int j = 0; j <= (wrd_len-1); j++ ){
                if (j==0 || j==wrd_len-1 ){
                    m.put(j, word.charAt(j));
                    // add the first and the last numbers on the used list
                    used.add(j);
                }else{
                    // add a random number on the used list
                    used.add(getRandom(wrd_len-1, used));
                }
            }
            
            for(int u : used){
                tempList.add(word.charAt(u));
            }
            tempList.add(' ');    
        }
        
        //using a stringbuilder to convert an array of chars to a string.
        StringBuilder builder = new StringBuilder();
        for(Character c : tempList) {
            builder.append(c);
        }
        
        System.out.println(builder);
        
    }
    
    public int getRandom(int max, List<Integer> used)
    {
        Random r = new Random();
        int n = r.nextInt(max);
        if (used.contains(n)){
            n = getRandom(max, used);
        }
        return n;
    }
    
    
    
    
}