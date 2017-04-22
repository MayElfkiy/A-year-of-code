//prints even indexed letter (space) odd indexed letters of an input word

package index;

import java.util.Scanner;

public class Indexx2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        scan.nextLine();
        for(int i=0; i<t ;i++){
          String s= scan.nextLine();
          char[] myCharArray = s.toCharArray();
           for (int r=0; r <s.length(); r+=2){
              System.out.print(myCharArray[r]);
          }
 
          System.out.print(" ");
            for(int n=1; n<s.length(); n+=2){
               System.out.print(myCharArray[n]);
          }
             System.out.println();
        
    
}
    }
    
}

