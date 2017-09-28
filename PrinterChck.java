/*
* File: PrinterChck.java
* Author: Shinyeob Kim
* Date: September 28th 2017
* Purpose: Simple switch to start or turn off printer.
*/

import java.util.*;
public class PrinterChck {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int turnOn;
    
       Printer printer1 = new Printer();
       
       System.out.println("Press |1| to turn ON your printer.\n" + "Press |2| to turn OFF your printer." + "\nPlease press |1| or |2| now:");
       turnOn = sc.nextInt();
        
       if (turnOn == 1){
       printer1.setIsOn(true);
       System.out.println("Your printer is ON and functioning properly");
       }else if(turnOn == 2){
       printer1.setIsOn(false);
       System.out.println("Your printer is OFF");

 
       
            
    }
    
}
}
