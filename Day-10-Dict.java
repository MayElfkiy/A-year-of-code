//Working with dictionaries
package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Dictionary {
 
    public static void main(String[] args) {
        //Phone book
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        
        Map<String,String> phoneBook = new HashMap<>();
        for (int i=0; i<n; i++){
            //scan.nextLine();
            String name= in.next();
            int phone=in.nextInt();
            phoneBook.put(name,String.valueOf(phone));
           
        }
        while(in.hasNext()){
           String s = in.next();
           if(phoneBook.containsKey(s)){
              System.out.println(s+"="+phoneBook.get(s));
           }
           else{
               System.out.println("Not found");
           }
            
        }
        in.close();
         
        
        
        
    }
    
}
