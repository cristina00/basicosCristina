/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoscristina;

/**
 *
 * @author cristina
 */
import java.util.Scanner;
public class BasicosCristina {
    

    public static void logicos(){
        
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("dime los meses de tu hijo/a:");
        int meses = scanner.nextInt();
        boolean chupete=(meses>=18)&&(meses<=24);
	
	if (chupete) {
        System.out.println("es aconsejable el chupete");
        }
        else{
            System.out.println("no es aconsejable el chupete");

        }
        
}
    
  
     public static void main(String[] args) {
        logicos(); 
    
}
}
