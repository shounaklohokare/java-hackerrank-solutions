import java.util.Scanner;

public class Solution {
                                                
    static boolean isAnagram(String a, String b) {
            
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        StringBuilder c = new StringBuilder(b);
        
        for(int i=0; i<a.length(); i++){
            
            for(int j=0; j<c.length(); j++){
                
                if(a.charAt(i)==c.charAt(j)){
                    
                    c.deleteCharAt(j);
                    
                    if(i==a.length()-1 && c.length()==0){
                        return true;
                    }
                    
                    break;
                }
                
            }
        }return false;
                           
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}