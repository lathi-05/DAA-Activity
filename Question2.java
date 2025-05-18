import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
         String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

    Locale INDIA = new Locale("en", "IN");

      NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(INDIA);
      String india = indiaFormat.format(payment);
      String indianCurrencySymbol = indiaFormat.getCurrency().getSymbol(INDIA);
      india = india.replace(indianCurrencySymbol, "Rs.");
      String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
      String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
