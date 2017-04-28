//2D ARRAY Hour glass summing in java
package pkg2darr;

import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int sum=0;
        int [][] arr = new int [6][6];
        for (int j=0; j<6; j++){
            for (int i=0; i<6; i++){
            arr[i][j]= in.nextInt();
            }
        
        }
        for (int j=0; j<=3; j++){
            for (int i=0; i<=3; i++){
            sum= arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+2]+arr[i+1][j+2]+arr[i+2][j+2];
            
            if (max<sum){
                max=sum;}
            
            
            }
            
                    }
        
       System.out.println(max);
    }
    
}
