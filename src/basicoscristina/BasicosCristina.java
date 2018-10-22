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
       /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }
    /**
     * @param args the command line arguments
     */
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
        numericos();  // Llamada al método
    
        logicos(); 
    

}
}
