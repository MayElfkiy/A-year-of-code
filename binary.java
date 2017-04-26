//Converts to binary and counts consecutive 1s
package binarynum;

import java.util.Scanner;

public class BinaryNum {

   
    public static void main(String[] args) {
     
      Scanner scan= new Scanner(System.in);
      int n= scan.nextInt();
      String binum = Integer.toBinaryString(n);
      int count= binum.length();
      char[] numArray= binum.toCharArray();
      int sum1 = 0;
      int max=0;
      
      for (int i=0; i<count; i++){
  
        if( numArray[i]== '1' ){
            
          sum1++;
           if (max < sum1){
               max =sum1;
           }
           
           
      }
        
        if(numArray[i]== '0') {sum1=0 ;}
         
      }
      System.out.println(max);
      
      
      System.out.println(binum);
      
      

      
      
    }
    
}
