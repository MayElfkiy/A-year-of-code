//Playing around with arithmetic and operators
package operators;

import java.util.Scanner;
import java.math.*;


public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        
        double tip= (tipPercent/100.0) * mealCost;
        double tax= (taxPercent/100.0) * mealCost;
        
       
        double totalCostd = mealCost+tip+tax;
        int totalCost = (int) Math.round(totalCostd);
        System.out.println("The total meal cost is " + totalCost +" dollars.");
        //System.out.println(tipPercent);
        //System.out.println(taxPercent);
        
    }
    
}
