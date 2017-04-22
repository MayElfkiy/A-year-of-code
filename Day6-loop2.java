//creates a series in the form of (a+b*2^0),(a+b*2^0+b*2^1), ..., (a+b*2^0+b*2^1+...b*2^(n-1)
package solution2;

import java.util.Scanner;


public class Solution2 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                          
            int s=a;
            for(int r=0; r<n; r++){
              s+=b*Math.pow(2,r);
         //   int ss= s+b*(int)Math.pow(2,r);
            System.out.print(s+" ");
            
        }
            System.out.println();
            
            
            
            
        }
            
            in.close();
    }
    
}

