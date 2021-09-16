/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvertercelsyfarengeit;
import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class
        KonverterCelsyFarengeit {
  
    /**
     * @param args the command line arguments
     */
    public static void
         main(String[] args) { 
             Scanner scanner = new Scanner(System.in);
             System.out.print("Введите Температуру по Цельсию: ");
             double temperaturaC = scanner.nextDouble();
             double temperaturaF = (temperaturaC/(5.0/9))+32;
             System.out.printf("Температура по Фаренгейту: %-3.2f%n", temperaturaF);
       
    }
    
}
