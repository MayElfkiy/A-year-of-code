//prints reversed elements of an integers array

package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int[] arr= new int[n];
        
        for (int i=0; i<n;i++){
            //int s=(n-1)-i;  
            arr[i]= in.nextInt();}
        for (int s=n-1; s>=0;s--){ 
            
              System.out.print(arr[s]+" ");}
        }
    }
    
